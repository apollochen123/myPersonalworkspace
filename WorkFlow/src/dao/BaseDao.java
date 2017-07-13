package dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {
	//根据id加载实体,一个类只有实现了Serializable接口，它的对象才是可序列化的
	T get(Class<T> entityClass,Serializable  id);
	
	//保存实体
    Serializable save(T entity);
    
    //更新
    void update(T entity);
    
    //删除
    void delete(T entity);
    
    //根据实体id，删除实体
    void delete(Class<T> entityClass,Serializable id);
    
    //获取实体
    List<T> findAll(Class<T> entityClass);
    
    // 获取实体总数
 	long findCount(Class<T> entityClass);
	

}
