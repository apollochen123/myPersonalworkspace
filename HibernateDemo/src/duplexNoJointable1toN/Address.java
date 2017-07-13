package duplexNoJointable1toN;

import javax.persistence.*;

@Entity
@Table(name="address_inf")
public class Address {
	@Id
	@Column(name="address_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer address_id;
	private String address_Detail;
	@ManyToOne(targetEntity=Person.class)
	//定义person_id的外键列，参照persion_id
	@JoinColumn(name="person_id",referencedColumnName="person_id",nullable=false)
	private Person person;
	public void setAddress_id(int address_id)
	{
		this.address_id = address_id;
	}
	public int getAddress_id()
	{
		return this.address_id;
	}

	// addressDetail的setter和getter方法
	public void setAddress_Detail(String address_Detail)
	{
		this.address_Detail = address_Detail;
	}
	public String getAddress_Detail()
	{
		return this.address_Detail;
	}
	public void setPerson(Person person){
		this.person=person;
	}
	public Person getPerson(){
		return this.person;
	}
	
	
}
