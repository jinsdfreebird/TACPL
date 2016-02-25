package DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.userVO;

public class userDAO {

	public void insert(userVO userVO) {
		// TODO Auto-generated method stub
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			//SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
			Session session =sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(userVO);
			tr.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public List search() {
		// TODO Auto-generated method stub
		try{
			SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionfactory.openSession();
			Query q = session.createQuery("from userVO");
			List list = q.list();
			int size = list.size();
			System.out.println(size);
			return list;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

	public List activate(userVO userVO) {
		// TODO Auto-generated method stub
		
		try{
			SessionFactory SessionFactory = new Configuration().configure().buildSessionFactory();
			Session Session =SessionFactory.openSession();
			Transaction tr = Session.beginTransaction();
			Query query = Session.createQuery("update userVO SET Activation='"+userVO.getActivation()+"' where User_ID='"+userVO.getUser_ID()+"'");
			query.executeUpdate();
			tr.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	

}
