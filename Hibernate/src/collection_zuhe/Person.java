package collection_zuhe;
import java.util.*;

import javax.persistence.*;
@Entity
@Table(name="person_zuhe")
public class Person {

	@Id @Column(name="person_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	
	private int age;
	
	//map集合value元素是组件
	@ElementCollection(targetClass=Score.class)//map集合value映射为score属性
	@CollectionTable(name="score_zuhe",
	    joinColumns=@JoinColumn(name="person_id",nullable=false))
	@MapKeyColumn(name="subject_name")
	@MapKeyClass(String.class)
	private Map<String,Score>score=new HashMap<>();
	
	
	//List集合value是组件
	@ElementCollection(targetClass=Name.class)//list集合value映射为Name属性
	@CollectionTable(name="nick_zuhe",
	         joinColumns=@JoinColumn(name="person_id",nullable=false))
	@OrderColumn(name="list_order")
	private List<Name>nicks=new ArrayList<>();
	
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return this.id;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return this.age;
	}
	public void setNicks(List<Name> nicks){
		this.nicks=nicks;
	}
	public List<Name> getNicks(){
		return this.nicks;
	}
	public Map<String,Score> getScore(){
		return this.score;
	}
	public void setScore(Map<String,Score> score){
		this.score=score;
	}
	
	

}
