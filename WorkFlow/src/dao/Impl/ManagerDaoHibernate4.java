package dao.Impl;

import java.util.List;

import dao.ManagerDao;
import domain.Manager;

public class ManagerDaoHibernate4 extends BaseDaoHibernate4<Manager> implements ManagerDao{

	@Override
	public List<Manager> findByNameAndPass(Manager mgr) {
		// TODO Auto-generated method stub
		List<Manager> ml=find("select m from Manager m where m.name = ?0 and m.pass=?1",mgr.getName(),mgr.getPass());

			return ml;

	}

	@Override
	public Manager findByName(String name) {
		List<Manager> ml = find("select m from Manager m where m.name=?0"
				, name);
			if (ml != null && ml.size() > 0)
			{
				return ml.get(0);
			}
			return null;
	}

}
