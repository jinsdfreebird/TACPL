package DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.roleVO;

public class roleDAO {

	public void insert(roleVO roleVO) {
		// TODO Auto-generated method stub
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session =sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(roleVO);
			tr.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
