package com.bridgelabz.service;
import com.bridgelabz.model.Team;
import com.bridgelabz.model.User;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bridgelabz.dao.UserDao;

@Repository("userService")
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserDao userdao;
	private UserService userService;

	public Collection<User> getUserByName(String userName) 
	{
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
	
	public boolean findByLogin(String userName, String password) 
	{	
		User user = (User) userService.getUserByName(userName);
		
		if(user!= null && user.getPassword().equals(password))
		{
			return true;
		} 
		
		return false;		
	}

}


