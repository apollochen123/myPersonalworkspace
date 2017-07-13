package persistClass.Oneto1Jointable;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;



@Entity
//实例持久化后的表名
@Table(name="Person_inf")
public class Person {
	//标准属性
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="person_id")
	private Integer id;
    private String name;
    private int age;
    
    //定义Person实体对应的关联属性
    @OneToOne(targetEntity=Address.class)
    @Cascade(value=CascadeType.ALL)
    //映射外键列，指定外键列名为address_id，不允许为空
    @JoinColumn(name="address_id",referencedColumnName="address_id",unique=true)

    private Address address;
    
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
    public void setAddress(Address address){
    	this.address=address;
    }
    public Address getAddress(){
    	return this.address;
    }
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}
    
    
    
    
	

}
