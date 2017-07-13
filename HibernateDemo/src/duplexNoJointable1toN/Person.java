package duplexNoJointable1toN;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="person_inf")
public class Person {
	@Id
	@Column(name="person_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Integer age;
	//mappedBy表明Person实体不控制关联关系
	@OneToMany(targetEntity=Address.class,mappedBy="person")
	private Set<Address> address=new HashSet<Address>();
	
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
    public void setAge(Integer age){
    	this.age=age;
    }
    public Integer getAge(){
    	return this.age;
    }
    public Set<Address> getAddress(){
    	return address;
    }
    public void setAddress(Set<Address> address){
    	this.address=address;
    }
    
    

}
