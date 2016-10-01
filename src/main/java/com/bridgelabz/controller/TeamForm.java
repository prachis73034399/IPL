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

 
    

}
