package com.bridgelabz.service;


import java.util.Collection;

import com.bridgelabz.model.Team;
import com.bridgelabz.model.User;

public interface UserService 
{
	 public Collection<User> getUserByName(String userName);
	 public Collection<User> getUserById(int countryId);
	// public Collection<Team> getTeamById(long countryId);
	 public void saveUser(User user);
	 boolean findByLogin(String userName, String password);
	 
}
