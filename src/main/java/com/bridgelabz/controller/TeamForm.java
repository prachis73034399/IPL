package com.bridgelabz.controller;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.dao.HibernateUserDao;
import com.bridgelabz.dao.UserDao;
import com.bridgelabz.model.Player;
import com.bridgelabz.model.Team;
import com.bridgelabz.model.User;
import com.bridgelabz.service.UserService;
import com.bridgelabz.validator.Validator;
import com.mysql.jdbc.Blob;

import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class TeamForm 
{
	static File dest=null; 
	@Autowired  //autowiring helps to inject a specific object 
	private Validator validator;
	@Autowired //autowiring helps to inject a specific object 
	private UserService userService;
	@Autowired
    private HttpServletRequest request;
	UserDao userdao;  
	HibernateUserDao hiberdao;
	SessionFactory sessionfactory;
	MultipartFile mpf = null; // Making object of predefined interface MultipartFile
   
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(Team team, MultipartHttpServletRequest request, Model model) throws IllegalStateException, IOException
	{
		Iterator<String> itr= request.getFileNames();
		
		// for storing the file in local system
		while(itr.hasNext())
		{
			mpf = request.getFile(itr.next());
			// storing image path in a string named filePath
			String filePath = "/home/bridgeit/Desktop/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ROOT/prachi/" + mpf.getOriginalFilename(); 
			File dest = new File(filePath);
			mpf.transferTo(dest);
			team.setImage(filePath);
		} 
		
		String img =mpf.getOriginalFilename();
		team.setImg(img);
		
		// Calling method saveteam from UserService class
		userService.saveteam(team);
		
		// calling method of UserService class and storing it in List
		List<Team> teamed=(List<Team>) userService.getAllTeams();
		return new ModelAndView("result","teamed", teamed);
		
	}

    @RequestMapping(value = "/saveplayer", method = RequestMethod.POST)
	public ModelAndView saved(Player plr, String teamName, MultipartHttpServletRequest request, Model model) throws IllegalStateException, IOException
	{
    	Iterator<String> itr= request.getFileNames();
		
    	// for storing the file in local system
		while(itr.hasNext())
		{
			mpf = request.getFile(itr.next());
			// storing image path in a string named filePath1
			String filePath1 = "/home/bridgeit/Desktop/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ROOT/prachi/" + mpf.getOriginalFilename(); 
			File dest = new File(filePath1);
			mpf.transferTo(dest); 
			plr.setImage(filePath1);
		} 
		
		String img = mpf.getOriginalFilename();
		plr.setImg(img);
		plr.setTeamName(teamName);
		// Calling method saveplayer from UserService class
		userService.saveplayer(plr);
		
		// calling method of UserService class and storing it in List
		List<Player> players = (List<Player>) userService.getAllSpPlayer(plr.getTeamName());
		return new ModelAndView("allplayers","players", players);
	}

    @RequestMapping(value = "/showplayers", method = RequestMethod.GET)
   	public ModelAndView showteams(@RequestParam(value = "teamName", required = true) String teamName, HttpServletRequest request, Model model) throws IllegalStateException, IOException
   	{
    	// calling method of UserService class and storing it in List
		List<Player> players=(List<Player>) userService.getAllSpPlayer(teamName);
		model.addAttribute("plrdd", teamName);
		return new ModelAndView("allplayers","players", players);
   	}

    @RequestMapping(value = "/playerdetails", method = RequestMethod.GET)
   	public ModelAndView palyerdetails(Player plr,@RequestParam(value = "playerName", required = true) String playerName,HttpServletRequest request, Model model) throws IllegalStateException, IOException
   	{
    	// calling method of UserService class and storing it in List
		List<Player> players=(List<Player>) userService.getPlayerByName(playerName);
		return new ModelAndView("playerdetails","players", players);
   	}
    
    
   /* @RequestMapping(value = "/teamformed", method = RequestMethod.GET)
   	public ModelAndView teamform(Team team,@RequestParam(value = "teamName", required = true) String teamName,HttpServletRequest request, Model model) throws IllegalStateException, IOException
   	{
    	// calling method of UserService class and storing it in List
    	System.out.println(teamName);
    	List<Player> teamsss=(List<Player>) userService.getAllSpPlayer(teamName);
		return new ModelAndView("","plrdd", teamName);
   	}

    @RequestMapping(value = "/teamforms", method = RequestMethod.GET)
   	public ModelAndView teamf(Team team, String teamName, HttpServletRequest request, Model model) throws IllegalStateException, IOException
   	{
    	// calling method of UserService class and storing it in List
    	System.out.println(teamName);
    	List<Player> teamsss=(List<Player>) userService.getAllSpPlayer(teamName);
		return new ModelAndView("allplayers","plrdd", teamName);
   	}*/

}
