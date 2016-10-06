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
	@Autowired
	private Validator validator;
	UserDao userdao;
	//autowiring helps to inject a specific object 
	@Autowired
	private UserService userService;
	SessionFactory sessionfactory;
	/*private final static Logger log = LoggerFactory.getLogger(Team.class);*/
	MultipartFile mpf = null;
    @Autowired
    private HttpServletRequest request;
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(Team team, MultipartHttpServletRequest request, Model model) throws IllegalStateException, IOException
	{
		System.out.println("TeamName:" + team.getTeamName());
		System.out.println("Captain Name:" + team.getCaptainName());
		System.out.println("ContentType:" + team.getContentType());
		Iterator<String> itr= request.getFileNames();
		// for storing the file in local system
		while(itr.hasNext())
		{
			mpf = request.getFile(itr.next());
			/*MultipartFile file1  = (MultipartFile) team.getFileData(); */ //Will return CommonsMultipartFile
			System.out.println(mpf.getOriginalFilename());
			String filePath = "/home/bridgeit/Desktop/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ROOT/prachi/" + mpf.getOriginalFilename(); 
			File dest = new File(filePath);
			mpf.transferTo(dest);
			team.setImage(filePath);
		} 
		
			String img =mpf.getOriginalFilename();
			team.setImg(img);	
			System.out.println("Imagepath:" + team.getImage());
			System.out.println("Img:" + team.getImg());
			/*Team team1 = new Team();*/
			System.out.println("Team INFO:"+ team);
			userService.saveteam(team);
			System.out.println("Team Saved");
			List<Team> teamed=(List<Team>) userService.getAllTeams();
			//model.addAttribute("teams",team.getImage());
			return new ModelAndView("result","teamed", teamed);
	}

 
    
    @RequestMapping(value = "/saveplayer", method = RequestMethod.POST)
	public ModelAndView saved(Player plr, MultipartHttpServletRequest request, Model model) throws IllegalStateException, IOException
	{
		System.out.println("TeamName:" + plr.getPlayerName());
		System.out.println("Captain Name:" + plr. getAge());
		System.out.println("ContentType:" + plr.getNationality());
		System.out.println("ContentType:" + plr.getBattingstyle());
		Iterator<String> itr= request.getFileNames();
		// for storing the file in local system
		while(itr.hasNext())
		{
			mpf = request.getFile(itr.next());
			/*MultipartFile file1  = (MultipartFile) team.getFileData(); */ //Will return CommonsMultipartFile
			System.out.println(mpf.getOriginalFilename());
			String filePath1 = "/home/bridgeit/Desktop/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ROOT/prachi/players/" + mpf.getOriginalFilename(); 
			File dest = new File(filePath1);
			mpf.transferTo(dest);
			plr.setImage(filePath1);
		} 
		
		String img =mpf.getOriginalFilename();
		plr.setImg(img);	
		System.out.println("Imagepath:" + plr.getImage());
		System.out.println("Img:" + plr.getImg());
		/*Team team1 = new Team();*/
		//System.out.println("Team INFO:"+ team);
		userService.saveplayer(plr);
		System.out.println("Player Saved");
		List<Player> players=(List<Player>) userService.getAllSpPlayer(plr.getTeamName());
		//model.addAttribute("teams",team.getImage());
		return new ModelAndView("player","players", players);
	}

    @RequestMapping(value = "/showplayers", method = RequestMethod.GET)
   	public ModelAndView showteams(@RequestParam(value = "teamName", required = true) String teamName, HttpServletRequest request, Model model) throws IllegalStateException, IOException
   	{
   	
   		//Iterator<String> itr= request.getFileNames();
   		// for storing the file in local system
   			String p= null;
   			System.out.println("Prachi "+teamName);
   			
   		
   			List<Player> players=(List<Player>) userService.getAllSpPlayer(teamName);
   			for (Player player : players)
   			{
				System.out.println("team name:"+player.getTeamName());
			}
   			//model.addAttribute("teams",team.getImage());
   			return new ModelAndView("allplayers","players", players);
   	}


    @RequestMapping(value = "/playerdetails", method = RequestMethod.GET)
   	public ModelAndView palyerdetails(Player plr,@RequestParam(value = "playerName", required = true) String playerName,HttpServletRequest request, Model model) throws IllegalStateException, IOException
   	{
    		System.out.println("Playercha nav:" + plr.getPlayerName());
    		
   			List<Player> players=(List<Player>) userService.getPlayerByName(playerName);
   			for (Player player : players) 
   			{
   				System.out.println("team name:"+player.getTeamName());
			}
   			//model.addAttribute("teams",team.getImage());
   			return new ModelAndView("playerdetails","players", players);
   	}

}
