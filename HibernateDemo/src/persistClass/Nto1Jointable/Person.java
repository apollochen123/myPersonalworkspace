package persistClass.Nto1Jointable;

import javax.persistence.*;



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
    @ManyToOne(targetEntity=Address.class)
    //映射外键列，指定外键列名为address_id，不允许为空
    @JoinTable(name="person_address",  //指定连接表名
    //指定连接表中persion_ID的外键列参考persion_id.
        joinColumns=@JoinColumn(name="persion_ID",referencedColumnName="person_id",unique=true),
    //指定连接表中address_id外键列的表明和参照当前实体关联实体的主键列
        inverseJoinColumns=@JoinColumn(name="address_id",referencedColumnName="address_id"))

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
