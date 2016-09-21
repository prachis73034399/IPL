package com.bridgelabz.service;

import com.bridgelabz.model.Team;
import com.bridgelabz.model.User;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bridgelabz.dao.HibernateUserDao;
import com.bridgelabz.dao.UserDao;

@Repository("userService")
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserDao userdao;
	private UserService userService;
	private HibernateUserDao hb;

	public Collection<User> getUsersByName(String userName) 
	{
		System.out.println(userName);
		return userdao.getUserByName(userName);
	}
	
	public Collection<User> getUserById(int id) 
	{
		return userdao.getUserById(id);
	}
	
	/*public Collection<Team> getTeamById(int teamId) 
	{
		return userdao.getTeamById(teamId);
	}*/
	
	public void saveUser(User user) 
	{
		userdao.save(user);
	}
	
	public void saveteam(Team team) 
	{
		userdao.saveteam(team);
	}
	
	User userName = new User();
	public boolean findByLogin(String userName, String password) 
	{	
		String  pass="";
		System.out.println("username:"+userName);
		Collection<User> list=hb.getUserByName(userName);
		System.out.println("listusers"+list);
		for (User object : list) 
		{
			pass=object.getPassword();
		}
		
		if(list!= null && pass.equals(password))
		{
			return true;
		} 
		
		return false;		
	}
	public Collection<Team> getAllTeams()
	{
		return (List<Team>) userdao.getAll();
	}

	public Collection<User> getAllUser()
	{
		return (List<User>) userdao.getAlluser();
	}
}


