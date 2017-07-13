package duplexJoinableNtoN;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="Address_inf")
public class Address {
	@Id
	@Column(name="address_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer address_id;
    private String address_Detail;
    
    @ManyToMany(targetEntity=Person.class)
    //定义连接表名
    @JoinTable(name="person_address",
    //定义主键列参照,本类的主键列的address_id
         joinColumns=@JoinColumn(name="address_id",referencedColumnName="address_id"),
         //映射连接表中名为person_id的外键列， 该列参照当前实体对应表的person_id主键列
         inverseJoinColumns=@JoinColumn(name="person_id",referencedColumnName="person_id")
    		)
    private Set<Person> person=new HashSet<Person>();
    	//	构造函数
    public Address(){}
    public Address(String address_Detail){
    	this.address_Detail=address_Detail;
    }
    //set。get方法
    public Integer getAddress_id(){
    	return this.address_id;
    }
    public void setAddress_id(Integer address_id){
    	this.address_id=address_id;
    }
    public String getAddress_Detail(){
    	return this.address_Detail;
    }
    public void setAddress_Detail(String address_Detail){
    	this.address_Detail=address_Detail;
    }
    
    public void setPerson(Set<Person> person){
    	this.person=person;
    }
    public Set<Person> getPerson(){
    	return this.person;
    }
    
    
    
	
}
