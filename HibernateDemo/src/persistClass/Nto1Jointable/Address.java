package persistClass.Nto1Jointable;

import javax.persistence.*;

@Entity
@Table(name="Address_inf")
public class Address {
	@Id
	//标准属性的表列名
	@Column(name="address_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int address_id;
	
	private String addressDetail;
	
	
	//构造
	public Address(){
		
	}
	public Address(String addressDetail){
		this.addressDetail=addressDetail;
	}
	
	// addressId的setter和getter方法
		public void setAddress_id(int address_id)
		{
			this.address_id = address_id;
		}
		public int getAddress_id()
		{
			return this.address_id;
		}

		// addressDetail的setter和getter方法
		public void setAddressDetail(String addressDetail)
		{
			this.addressDetail = addressDetail;
		}
		public String getAddressDetail()
		{
			return this.addressDetail;
		}
	}
	


