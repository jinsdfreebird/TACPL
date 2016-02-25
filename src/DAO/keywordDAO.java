package DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.keywordVO;

public class keywordDAO {

	public void insert(keywordVO keywordVO) {
		// TODO Auto-generated method stub
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session =sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(keywordVO);
			tr.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
