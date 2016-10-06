package com.bridgelabz.service;


import com.bridgelabz.model.Player;
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
		return (List<User>) userdao.getUserByName(userName);
	}
	
	public Collection<User> getUserById(int id) 
	{
		return userdao.getUserById(id);
	}
	
	public Collection<Team> getTeamById(int teamId) 
	{
		return userdao.getTeamById(teamId);
	}
	
	public void saveUser(User user) 
	{
		userdao.save(user);
	}
	
	public void saveteam(Team team) 
	{
		userdao.saveteam(team);
	}
	
	public void saveplayer(Player plr) 
	{
		userdao.saveplayer(plr);
	}
	
	
	User userName = new User();
	public boolean findByLogin(String userName, String password) 
	{	
		/*String  pass="";
		System.out.println("username:"+userName);
		Collection<User> list=hb.getUserByName(userName);
		System.out.println("listusers"+list);
		for (User object : list) 
		{
			pass=object.getPassword();
		}*/
		String pass="";
		String username="";
		User user1= new User();
		List<User> user = (List<User>) getUsersByName(userName);
		System.out.println(user);
		/*if(user!= null &&  user.getPassword.equals(user1.getPassword()))
		{
			return true;
		} */
		for(User object: user)
		{
			pass =object.getPassword();
			username=object.getUserName();
		}
		if(username.equals(userName) && pass.equals(password))
		{
			return true;
		}
		else
		{
		return false;
		}
		//return false;		
	}
	public Collection<Team> getAllTeams()
	{
		return (List<Team>) userdao.getAllTeam();
	}

	public Collection<User> getAllUser()
	{
		return (List<User>) userdao.getAlluser();
	}
	
	public Collection<Player> getAllPlayer()
	{
		return (List<Player>) userdao.getAllPlayer();
	}
	
	/*public Collection<User> getTeamByName(String teamName)
	{
		return (<Team>) userdao.getTeamByName(teamName);	
		
	}*/
	public Collection<Player> getAllSpPlayer(String teamname)
	{
		return (List<Player>) userdao.getAllSpecificPlayer(teamname);
	}
	
	public Collection<Player> getAllInfoPlayer(String playerName)
	{
		return (List<Player>) userdao.getAllInfoPlayer(playerName);
	}
	
	public Collection<Player> getPlayerByName(String playerName) 
	{
		return userdao.getPlayerByName(playerName);
	}
	 
}


