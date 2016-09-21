package com.bridgelabz.dao;
import java.util.Collection;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.bridgelabz.model.Team;
import com.bridgelabz.model.User;


@Repository("HibernateUserDao")
public class HibernateUserDao implements UserDao 
{

	@Autowired
	SessionFactory sessionFactory;
	Session session;
	public Collection<User> getUserByName(String userName)
	{
		System.out.println("by name");
		//calling method opensession for opening the session of sessionFactory assigning to the object of Session interface
		session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from User where userName=:userName").setParameter("userName",userName);
		System.out.println("USERNAME is:"+userName);
		List list = query.list();
		return list;
	}

	public Collection<User> getUserById(int userId) 
	{
		//calling method opensession for opening the session of sessionFactory assigning to the object of Session interface
		session = sessionFactory.openSession();
		// calling beginTransaction method of session interface
		session.beginTransaction();
		//using create query method of session interface and storing it into Query interface object
		Query query = session.createQuery("from User where id=:id").setParameter("id",userId);
		List list = query.list();
		return list;
	}
	/*public Collection<Team> getTeamById(int teamId) 
	{
		//calling method openSession for opening the session of sessionFactory assigning to the object of Session interface
		session = sessionFactory.openSession();
		// calling beginTransaction method of session interface
		session.beginTransaction();
		//using create query method of session interface and storing it into Query interface object
		Query query = session.createQuery("from Team where id=:id").setParameter("id",teamId);
		List list = query.list();
		return list;
	}*/

	public void save(User user) 
	{
		//calling method opensession for opening the session of sessionFactory assigning to the object of Session interface
		session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(user);
		tr.commit();

	}
	
	public void saveteam(Team team) 
	{
		//calling method opensession for opening the session of sessionFactory assigning to the object of Session interface
		session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(team);
		tr.commit();

	}
	
	public Collection<Team> getAll()
	{
		//calling method opensession for opening the session of sessionFactory assigning to the object of Session interface
		session = sessionFactory.openSession();
		session.beginTransaction();
		
		Query query = session.createQuery("from Team");
		List list = query.list();

		return list;
	}
	
	public Collection<User> getAlluser()
	{
		//calling method opensession for opening the session of sessionFactory assigning to the object of Session interface
		session = sessionFactory.openSession();
		session.beginTransaction();
		
		Query query = session.createQuery("from User");
		List list = query.list();

		return list;
	}
	
	/*public void deleteById(int id)
	{
		session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
	  
	    User user ;

	   // session = sessionFactory.getCurrentSession();
	    user= (User)session.load(Country.class,id);
	    session.delete(country);

	    //This makes the pending delete to be done
	    session.flush() ;
	    tr.commit();
	}*/

	
}
