package news_TableGenerator;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.service.*;
import org.hibernate.boot.registry.*;
import news_TableGenerator.News;

public class NewsManager {
	public static void main(String[] args) throws Exception{
		//实例化Configuration对象
		Configuration conf=new Configuration().configure();//configure不带参数说明默认加载hibernate.cfg.xml
		//sessionFactory创建的步骤
		ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
		
		SessionFactory sf=conf.buildSessionFactory(serviceRegistry);
		
		//创建session对象
		Session sess=sf.openSession();
		
		//开始事物
		Transaction tx=sess.beginTransaction();
		//News为持久化类
		News n=new News();
		n.setTitle("别乱摸");
		n.setContent("好不好");
		sess.save(n);
		tx.commit();//事物提交
		sess.close();
		sf.close();
		
	}

}
