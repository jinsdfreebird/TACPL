package DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.candidateRegistratioVO;

public class candidateRegistrationDAO {

	public void insert(candidateRegistratioVO candidateRegistratioVO) {
		// TODO Auto-generated method stub
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			//SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
			Session session =sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(candidateRegistratioVO);
			tr.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
