package dao.Impl;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import service.MgrManager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml","classpath:daoContext.xml"})
public class ManagerDaoTest extends AbstractTransactionalJUnit4SpringContextTests {
	@Resource(name="mgrManager")
	private MgrManager mgrManager;
	
	@Test
	
	public void TestAddEmp(){

		mgrManager.getSalaryByMgr("oracle");
	}
	
	

}
