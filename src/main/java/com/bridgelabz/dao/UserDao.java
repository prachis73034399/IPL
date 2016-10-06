package com.bridgelabz.dao;


import java.util.Collection;

import com.bridgelabz.model.Player;
import com.bridgelabz.model.Team;
import com.bridgelabz.model.User;


public interface UserDao 
{
	public Collection<User> getUserByName(String userName);
	public Collection<User> getUserById(int countryId);
	public Collection<Team> getTeamByName(String teamName);
	public Collection<Team> getTeamById(int teamId);
	public void save(User user);
	public void saveteam(Team team);
	public void saveplayer(Player plr);
	public Collection<Team> getAllTeam();
	public Collection<User> getAlluser();
	public Collection<Player>getAllPlayer();
	public Collection<Player> getAllSpecificPlayer(String teamname);
	public Collection<Player>getAllInfoPlayer(String playerName);
}

