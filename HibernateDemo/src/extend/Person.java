package extend;



import javax.persistence.*;

@Entity
@Table(name="person_inf")
//辨别者列
@DiscriminatorColumn(name="person_type",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("普通人")
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private char gender;
	//指定1对多，关联关系多端控制
	@Embedded
	@AttributeOverrides({
	@AttributeOverride(name="detail",column=@Column(name="address_detail")),
	@AttributeOverride(name="zip",column=@Column(name="address_zip")),
	@AttributeOverride(name="country",column=@Column(name="address_country"))})
	private Address address;
	//无参构造
	public Person(){
		
	}
	public Person(Integer id,String name,char gender){
		this.id=id;
		this.name=name;
		this.gender=gender;
		
	}
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setGender(char gender){
		this.gender=gender;
	}
	public char getGender(){
		return this.gender;
	}
	public void setAddress(Address address){
		this.address=address;
	}
	public Address getAddress(){
		return this.address;
	}
	
	
	

}
