package com.bridgelabz.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import com.mysql.jdbc.Blob;

@Entity
@Table
public class Team 
{

	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;

	@Column(name="name")
	private String teamName;

	@Column(name="name")
	private String captainName;

	@Column(name="filename")
	private String filename;

	public String getFilename()
	{
		return filename;
	}
	public void setFilename(String filename) 
	{
		this.filename = filename;
	}
	public Blob getContent()
	{
		return content;
	}
	public void setContent(Blob content) 
	{
		this.content = content;
	}
	public String getContentType() 
	{
		return contentType;
	}
	public void setContentType(String contentType) 
	{
		this.contentType = contentType;
	}
	@Column(name="content")
	@Lob
	private Blob content;
	
	@Column(name="content_type")
	private String contentType;
	
	public Team () {}
	public Team (Integer id, String teamname, String captainName, String filename, String  contentType, Blob content) 
	{
		setId(id);
		setTeamName(teamname);
		setCaptainName(captainName);
		setFilename(filename);
		setContentType(contentType);
		setContent(content);
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
	public String getCaptainName() 
	{
		return captainName;
	}
	public void setCaptainName(String captainName) 
	{
		this.captainName = captainName;
	}

}
