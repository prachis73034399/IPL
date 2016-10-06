package com.bridgelabz.service;


import java.util.Collection;

import com.bridgelabz.model.Player;
import com.bridgelabz.model.Team;
import com.bridgelabz.model.User;

public interface UserService 
{
	 public Collection<User> getUsersByName(String userName);
	 public Collection<User> getUserById(int countryId);
	 public Collection<Team> getTeamById(int teamId);
	 public void saveUser(User user);
	 public void saveteam(Team team); 
	 public void saveplayer(Player plr); 
	 boolean findByLogin(String userName, String password);
	 public Collection<Team>  getAllTeams();
	 public Collection<User> getAllUser();
	 public Collection<Player> getAllPlayer();
	 public Collection<Player> getAllSpPlayer(String teamname);
	 public Collection<Player> getAllInfoPlayer(String playerName);
}
