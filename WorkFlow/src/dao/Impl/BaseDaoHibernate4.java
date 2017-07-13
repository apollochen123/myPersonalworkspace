package dao.Impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import dao.BaseDao;


public class BaseDaoHibernate4<T> implements BaseDao<T> {
	
	//spring 依赖注入
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	public SessionFactory getSessionFactory(){
		return this.sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(Class<T> entityClass, Serializable id) {
		// TODO Auto-generated method stub
		return (T) getSessionFactory().getCurrentSession().get(entityClass, id);
	}

	@Override
	public Serializable save(T entity)
	{
		return getSessionFactory().getCurrentSession()
			.save(entity);
	}

	@Override
	public void update(T entity) {
		// TODO Auto-generated method stub
		getSessionFactory().getCurrentSession().update(entity);
		return;
	}

	@Override
	public void delete(T entity) {
		// 删除实体
		getSessionFactory().getCurrentSession().delete(entity);
		return;
	}

	@Override
	public void delete(Class<T> entityClass, Serializable id) {
		// 根据id删除实体，getSimpleName()返回的源代码中的 基类 的简单名称
		getSessionFactory().getCurrentSession()
		.createQuery("delete "+entityClass.getSimpleName()+" en where en.id= ?0")
		.setParameter("0", id)
		.executeUpdate();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll(Class<T> entityClass) {
		// 返回所有实体
		return getSessionFactory().getCurrentSession()
				.createQuery("select en from "+ entityClass.getSimpleName() + " en")
				.list();
	}

	@Override
	public long findCount(Class<T> entityClass) {
		//返回实体数量
	      List<?> l=getSessionFactory().getCurrentSession()
				.createQuery("select count(*) from "+entityClass.getSimpleName()).list();
	      if(l!=null&&l.size()==1){
	    	  return (long) l.get(0);
	      }
	      return 0;
	}
	
	// 根据HQL语句查询实体
    @SuppressWarnings("unchecked")
    protected List<T> find(String hql)
	{
	    return (List<T>)getSessionFactory().getCurrentSession()
				.createQuery(hql)
				.list();
	}
	
    //根据HQL查询，带参数
    @SuppressWarnings("unchecked")
	public List<T> find(String hql,Object... params){
    	Query query=getSessionFactory().getCurrentSession()
    			.createQuery(hql);
    	for(int i=0,len = params.length;i<len;i++){
    		query.setParameter(i+"", params[i]);
    	}
    	return (List<T>)query.list();
    }
    //分页查询
    @SuppressWarnings("unchecked")
	public List<T> findByPage(String hql,int page,int pageSize){
    	return getSessionFactory().getCurrentSession()
    			.createQuery(hql)
    			.setFirstResult((page-1)*pageSize)
    			.setMaxResults(pageSize)
    			.list();
    }
	@SuppressWarnings("unchecked")
	public List<T> findByPage(String hql,int page,int pageSize,Object...params){
    	Query query=getSessionFactory().getCurrentSession()
    			.createQuery(hql)
    			.setFirstResult((page-1)*pageSize)
    			.setMaxResults(pageSize);
    	for(int i=0;i<params.length;i++){
    		query.setParameter(i+"", params[i]);
    	}
    	return query.list();
    			
    }
    

}