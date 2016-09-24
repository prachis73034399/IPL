package com.bridgelabz.controller;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.bridgelabz.dao.UserDao;
import com.bridgelabz.model.Team;
import com.bridgelabz.model.User;
import com.bridgelabz.service.UserService;
import com.bridgelabz.validator.Validator;
import com.mysql.jdbc.Blob;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class TeamForm 
{
	@Autowired
	private Validator validator;
	UserDao userdao;
	//autowiring helps to inject a specific object 
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value="/teamform", method=RequestMethod.POST)
	public ModelAndView create(Model model, @ModelAttribute("teams") Team team) 
	{	
		System.out.println("create");
		System.out.println(team.getTeamName());
		System.out.println(team.getCaptainName());
		/*List<Team> team=(List<Team>) userService.getAllTeams();*/
		List<User> user2=(List<User>) userService.getAllUser();
		/*Team team1 = new Team();*/	
		/*Team team = new Team();*/
		//model.addAttribute("teams", team);
		return new ModelAndView("iplteamlist"," ",team);
	}
	@RequestMapping(value = "teamformed", method = RequestMethod.POST)
	//update method will check for validation and save the country and return new countryList
	public ModelAndView create(Team team, BindingResult result, SessionStatus status, Model model)
	{
			userService.saveteam(team);
			status.setComplete();
			System.out.println("Team Saved");
			model.addAttribute("team", team);
			List<Team> team1=(List<Team>) userService.getAllTeams();
			
			return new ModelAndView("iplteamlist","team",team1);
			//return ;
		}
	

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(
			@ModelAttribute("document") Team team,
			@RequestParam("file") MultipartFile file) 
	{
		
		
		System.out.println("Name:" + team.getTeamName());
		System.out.println("File:" + file.getName());
		System.out.println("ContentType:" + file.getContentType());
		
		try {
			Blob blob = Hibernate.getLobCreator(sessionfactory.getCurrentSession()).createBlob()(file.getInputStream());

			team.setFilename(file.getOriginalFilename());
			team.setContent(blob);
			team.setContentType(file.getContentType());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			userdao.saveteam(team);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:/iplteamlist.html";
	}

}
