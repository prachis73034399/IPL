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

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", age=" + age + ", nationality="
				+ nationality + ", battingstyle=" + battingstyle + ", bowlingstyle=" + bowlingstyle + ", image=" + image
				+ ", img=" + img + ", teamName=" + teamName + "]";
	}
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer playerId;

	@Column(name="playerName")
	private String playerName;

	@Column(name="age")
	private Integer age;
	
	@Column(name="nationality")
	private String nationality;

	@Column(name="battingstyle")
	private String battingstyle ;

	@Column(name="bowlingstyle")
	private String bowlingstyle ;
	
	@Column(name="image")
	private String image ;
	
	@Column(name="img")
	private String img;


	@Column(name="teamname")
	private String teamName;

	public Player () {}
	public Player (Integer playerId, Integer age, String playerName, String nationality, String battingstyle, String  bowlingstyle) 
	{
		setPlayerId(playerId);
		setPlayerName(playerName);
		setAge(age);
		setNationality(nationality);
		setBattingstyle(battingstyle);
		setBowlingstyle(bowlingstyle);
		
	}

	public boolean isNew() 
	{
		return playerId == null;
	}

	public Integer getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getBattingstyle() {
		return battingstyle;
	}
	public void setBattingstyle(String battingstyle) {
		this.battingstyle = battingstyle;
	}
	public String getBowlingstyle() {
		return bowlingstyle;
	}
	public void setBowlingstyle(String bowlingstyle) {
		this.bowlingstyle = bowlingstyle;
	}
	
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
}
