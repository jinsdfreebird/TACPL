package DAO;


import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.Iterator;
//import java.util.*;
import java.util.List;





//import antlr.collections.List;
import VO.jobCategoryVO;

public class jobCategoryDAO {

	public void insert(jobCategoryVO jobCategoryVO) {
		// TODO Auto-generated method stub
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			//SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
			Session session =sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(jobCategoryVO);
			tr.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public List serch() {
		// TODO Auto-generated method stub
		try{
			SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
			Session session =sessionFactory.openSession();
		
			Query q = session.createQuery("from jobCategoryVO");
			List ls = q.list();
			int siz = ls.size();
			System.out.println(siz);
		
			return ls;
						
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	public List findname(jobCategoryVO jobCategoryVO) {
		// TODO Auto-generated method stub
		try{
			SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
			Session session =sessionFactory.openSession();
		
			Query q = session.createQuery("from jobCategoryVO where Cat_ID ='"+jobCategoryVO.getCat_ID()+"'");
			List ls = q.list();
			int siz = ls.size();
			System.out.println(siz);
			
			System.out.println("DAO");
			Iterator itr = ls.iterator(); 
			String Cat_name = ((jobCategoryVO) itr.next()).getCat_name();
			
			System.out.println(Cat_name);
			return ls;
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null ;
	}

}
