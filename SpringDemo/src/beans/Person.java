package beans;

public class Person {
	public Person()
	{System.out.println("正在执行无参构造方法");}
	
	public void setName(String name){
		System.out.println("正在调用"+name+"的setter方法。设值注入");
	}

}
