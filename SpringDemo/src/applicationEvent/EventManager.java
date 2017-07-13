package applicationEvent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		//实例化一个事件
		EmailEvent ele=new EmailEvent("manager","100221313","23dadsadas");
		//发布容器事件
		ctx.publishEvent(ele);

	}

}
