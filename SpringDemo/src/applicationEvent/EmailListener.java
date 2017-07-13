package applicationEvent;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

@SuppressWarnings("rawtypes")
public class EmailListener implements ApplicationListener{
	
	public void onApplicationEvent(ApplicationEvent eve){
		//只处理EmailEvent，模拟发送的email通知
		if(eve instanceof EmailEvent){
			EmailEvent emailEvent=(EmailEvent) eve;
			System.out.println("需要发送的邮件地址是："+emailEvent.getAddress());
			System.out.println("邮件内容是："+emailEvent.getText());
		}
		else{
			System.out.println("其他事件"+eve);
		}
	

}}
