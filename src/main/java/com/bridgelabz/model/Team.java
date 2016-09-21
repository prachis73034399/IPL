package com.bridgelabz.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table
public class Team 
{

	@Id
	@GeneratedValue
	private Integer id;

	@NotEmpty
	@Size(min = 4, max = 20)
	private String teamName;
	
	@NotEmpty
	private String captainName;
	
	public Team () {}
	public Team (Integer id, String teamname) 
	{
		setId(id);
		setTeamName(teamname);
	
	}

	public boolean isNew() 
	{
		return id == null;
	}

	public Integer getId() 
	{
		return id;
	}

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public String getTeamName() 
	{
		return teamName;
	}

	public void setTeamName(String userName) 
	{
		this.teamName = userName;
	}
	public String getCaptainName() {
		return captainName;
	}
	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}

}
