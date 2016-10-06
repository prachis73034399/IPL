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

import com.bridgelabz.model.Player;
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


	public Collection<User> getUserByPassword(String password)
	{
		System.out.println("by name");
		//calling method opensession for opening the session of sessionFactory assigning to the object of Session interface
		session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from User where password=:password").setParameter("password",password);
		System.out.println("USERNAME is:"+password);
		List list = query.list();
		return list;
	}
	public Collection<User> getUserById(int userId) 
	{
		//calling method opensession for opening the session of sessionFactory assigning to the object of Session interface
		session = sessionFactory.openSession();
		// calling beginTransaction method of session interface
		session.beginTransaction();
		User user = new User();
		//using create query method of session interface and storing it into Query interface object
		Query query = session.createQuery("from User where id=:id").setParameter("id",userId);
		List list = query.list();
		return list;
	}
	
	
	public Collection<User> getPlayerById(int playerId) 
	{
		//calling method opensession for opening the session of sessionFactory assigning to the object of Session interface
		session = sessionFactory.openSession();
		// calling beginTransaction method of session interface
		session.beginTransaction();
		User user = new User();
		//using create query method of session interface and storing it into Query interface object
		Query query = session.createQuery("from Player where id=:id").setParameter("id",playerId);
		List list = query.list();
		return list;
	}
	public Collection<Team> getTeamById(int teamId) 
	{
		//calling method openSession for opening the session of sessionFactory assigning to the object of Session interface
		session = sessionFactory.openSession();
		// calling beginTransaction method of session interface
		session.beginTransaction();
		//using create query method of session interface and storing it into Query interface object
		Query query = session.createQuery("from Team ");
		List list = query.list();
		return list;
	}

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
	
	
	public void saveplayer(Player plr) 
	{
		//calling method opensession for opening the session of sessionFactory assigning to the object of Session interface
		session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		
		session.save(plr);
		tr.commit();

	}
	public Collection<Team> getAllTeam()
	{
		//calling method opensession for opening the session of sessionFactory assigning to the object of Session interface
		session = sessionFactory.openSession();
		session.beginTransaction();
		Team team = new Team();
		Query query = session.createQuery("from Team");
		List list = query.list();

		return list;
	}
	
	public Collection<Player> getAllPlayer()
	{
		//calling method opensession for opening the session of sessionFactory assigning to the object of Session interface
		session = sessionFactory.openSession();
		session.beginTransaction();
		Player player = new Player();
		Query query = session.createQuery("from Player");
		List list = query.list();

		return list;
	}
	
	public Collection<Player> getAllSpecificPlayer(String teamname)
	{
		//calling method opensession for opening the session of sessionFactory assigning to the object of Session interface
		session = sessionFactory.openSession();
		session.beginTransaction();
		Player player = new Player();
	//	Team team = new Team();
		
	//	String teamname = team.getTeamName();
		Query query = session.createQuery("from Player where teamname=:teamname").setParameter("teamname",teamname);
		List list = query.list();

		return list;
	}
	
	public Collection<Player> getAllTeamPlayer(String teamname)
	{
		//calling method opensession for opening the session of sessionFactory assigning to the object of Session interface
		session = sessionFactory.openSession();
		session.beginTransaction();
		Player player = new Player();
	//	Team team = new Team();
		
	//	String teamname = team.getTeamName();
		Query query = session.createQuery("from Team where teamname=:teamname").setParameter("teamname",teamname);
		List list = query.list();

		return list;
	}
	public Collection<Team> getTeamByName(String teamname)
	{
		System.out.println("by team name");
		//calling method opensession for opening the session of sessionFactory assigning to the object of Session interface
		session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Team where teamname=:teamname").setParameter("teamName",teamname);
		System.out.println("USERNAME is:"+teamname);
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

	public Collection<Player> getAllInfoPlayer(String playerName)
	{
		//calling method opensession for opening the session of sessionFactory assigning to the object of Session interface
		session = sessionFactory.openSession();
		session.beginTransaction();
		Player player = new Player();
		Query query = session.createQuery("from Player where playerName=:playerName").setParameter("playerName",playerName);
		List list = query.list();

		return list;
	}
	
}
