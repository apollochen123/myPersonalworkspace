package server;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import domain.Manager;
import service.EmpManager;

@SuppressWarnings("unused")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml","classpath:daoContext.xml"})
public class EmpManagerTest extends AbstractTransactionalJUnit4SpringContextTests{
	@Resource(name="empManager")
	private EmpManager empManager;
	
//	@Test
//	public void TestLogin(){
//		Manager mgr=new Manager();
//		mgr.setName("orace");
//		mgr.setPass("oracl");
//		
//		int a=empManager.validLogin(mgr);
//		System.out.println(a);
//	}
//	@Test
//	public void TestAutoPunch(){
//		empManager.autoPunch();
//	}
//	@Test
//	public void TestAutoPay(){
//		empManager.autoPay();
//	}
//	@Test
//	public void TestPunch(){
//		empManager.punch("tomcat", "2016-11-22", false);
//	}
//	@Test
//	public void TestSalary(){
//		empManager.empSalary("tomcat");
//	}
//	@Test
//	public void TestUnAtend(){
//		empManager.unAttend("tomcat");
//	}
	@Test
public void Test(){
	long i=65;
	char a=(char)i;
	System.out.println(a);
	
}
	

}
