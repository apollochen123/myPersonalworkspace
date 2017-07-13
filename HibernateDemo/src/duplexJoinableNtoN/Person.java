package duplexJoinableNtoN;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="person_inf")
public class Person {
	@Id
	@Column(name="person_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer person_id;
	
	private String name;
	private int age;
	
	@ManyToMany(targetEntity=Address.class)
	@JoinTable(name="person_address",
	//
	joinColumns=@JoinColumn(name="person_id",referencedColumnName="person_id"),
	inverseJoinColumns=@JoinColumn(name="address_id",referencedColumnName="address_id")
			)
	private Set<Address> address=new HashSet<Address>();
	
	
	
	public Integer getPerson_id(){
		return this.person_id;
	}
	public void setPerson_id(Integer person_id){
		this.person_id=person_id;
	}
	public Integer getAge(){
		return this.age;
	}
	public void setAge(Integer age){
		this.age=age;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public Set<Address> getAddress(){
		return this.address;
	}
	public void setAddress(Set<Address> address){
		this.address=address;
	}
	
	
	
  
}
