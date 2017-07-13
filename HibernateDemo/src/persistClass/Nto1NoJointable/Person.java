package persistClass.Nto1NoJointable;

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
	private Integer id;
	
	private String name;
    private int age;
    
    //定义Person实体对应的关联属性
    @ManyToOne(targetEntity=Address.class)
    //映射外键列，指定外键列名为address_id，不允许为空
    @JoinColumn(name="address_id",nullable=false)
//级联属性
//    1) none  :在保存,更新或删除当前对象时,忽略其他关联的对象,它是cascade属性的默认值.
//    2)save-update : 当通过Session 的 save() , update() 以及saveOrUpdate()方法来保存或更新当时对象时,级联保存所有关联的新建的临时对象,并且级联更新所有关联的游离对象.
//    3)delete : 当通过Session 的 delete()方法删除当前对象时,级联删除所有关联的对象.
//    4)all :  包含save-update以及delete的行文.  此外,对当前对象执行evict()或lock()操作时,也会对所关联的持久化对象执行evict()和lock()操作.
//    5)delete-orphan :删除所有和当前对象解除关联关系的对象.
//    6)all-delete-orphan :包含all 和 delete-orphan的行为
    @Cascade(CascadeType.ALL)
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
