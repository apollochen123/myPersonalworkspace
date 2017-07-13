package main_Manager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;





public class FirstBean {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		

	}

}
