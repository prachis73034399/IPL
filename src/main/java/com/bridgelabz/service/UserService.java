package com.bridgelabz.service;


import java.util.Collection;

import com.bridgelabz.model.Team;
import com.bridgelabz.model.User;

public interface UserService 
{
	 public Collection<User> getUsersByName(String userName);
	 public Collection<User> getUserById(int countryId);
	// public Collection<Team> getTeamById(long countryId);
	 public void saveUser(User user);
	 public void saveteam(Team team); 
	 boolean findByLogin(String userName, String password);
	 public Collection<Team> getAllTeams();
	 public Collection<User> getAllUser();
}
