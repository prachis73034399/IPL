package com.bridgelabz.model;




import java.io.File;
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
public class Player
{

	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer playerId;

	@Column(name="teamname")
	private String playerName;

	@Column(name="captainName")
	private int age;
/*
	@Column(name="image")
	private String ;

	
	@Column(name="fileData")
	private File fileData;
	
	
	@Column(name="content_type")
	private String contentType;
	
	
	
	public Player () {}
	public Player (Integer id, String teamname, String captainName, String image, String  contentType) 
	{
		setId(id);
		setTeamName(teamname);
		setCaptainName(captainName);
		setImage(image);
		setContentType(contentType);
		
	}

	public boolean isNew() 
	{
		return teamId == null;
	}

	public Integer getId() 
	{
		return teamId;
	}

	public void setId(Integer teamId) 
	{
		this.teamId = teamId;
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
	
	public String getImage()
	{
		return image;
	}
	public void setImage(String image) 
	{
		this.image = image;
	}
	
	public String getContentType() 
	{
		return contentType;
	}
	public void setContentType(String contentType) 
	{
		this.contentType = contentType;
	}

	public File getFileData() {
		return fileData;
	}
	public void setFileData(File fileData) {
		this.fileData = fileData;
	}*/
}
