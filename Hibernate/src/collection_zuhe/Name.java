package collection_zuhe;
import javax.persistence.*;
import org.hibernate.annotations.Parent;
//作为集合类List的value属性值
@Embeddable
public class Name {
	@Column(name="person_firstname")
	private String first;
	
	@Column(name="person_lastname")
	private String last;
	
	@Parent
	private Person owner;//为了告诉Hibernate,owner不是一个普通属性，实时包含name属性的实体，@Parent来注释
	
	public Name(){
		//无参数构造器
	}
	public Name(String frist,String last){
		this.first=frist;
		this.last=last;
		
	}
	public void setFirst(String first)
	{
		this.first = first;
	}
	public String getFirst()
	{
		return this.first;
	}

	// last的setter和getter方法
	public void setLast(String last)
	{
		this.last = last;
	}
	public String getLast()
	{
		return this.last;
	}

	// owner的setter和getter方法
	public void setOwner(Person owner)
	{
		this.owner = owner;
	}
	public Person getOwner()
	{
		return this.owner;
	}

}