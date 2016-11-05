package com.bridgelabz.controller;
import java.util.Collection;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.bridgelabz.model.Team;
import com.bridgelabz.model.User;
import com.bridgelabz.model.UserLogin;
//import com.bridgelabz.model.StudentLogin;
import com.bridgelabz.service.UserService;
import com.bridgelabz.validator.Validator;

@Controller

public class UserController 
{
	//autowiring helps to inject a specific object 
	@Autowired
	private UserService userService;
	private Validator validator;
	
	
	@RequestMapping(value="/signup", method=RequestMethod.GET)
	public ModelAndView signup(Model model) 
	{	
		// calling getAllUser method of userService interface and storing in list of user type
		List<User> user2=(List<User>) userService.getAllUser();
		User user = new User();	
		
		// calling addAttribute method of Model class
		model.addAttribute("userer", user);
		return new ModelAndView("signup","user",user2);
	}
	
	
	@RequestMapping(value="signing.html",  method=RequestMethod.POST)
	public ModelAndView signup(User userer, BindingResult result, Model model) 
	{	
		User user= new User();
		userService.saveUser(userer);
		
		// calling addAttribute method of Model class
		model.addAttribute("userLogin", user);
		
		// calling getAllUser method of userService interface and storing in list of user type
		List<User> user1=(List<User>) userService.getAllUser();
		return new ModelAndView("login","", "");
	}

	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView login(Model model) 
	{	
		// calling getAllUser method of userService interface and storing in list of user type
		List<User> user2=(List<User>) userService.getAllUser();
		UserLogin userLogin = new UserLogin();	
		
		// calling addAttribute method of Model class
		model.addAttribute("userLogin", userLogin);
		return new ModelAndView("login","user",user2);
	}
	
	
	@RequestMapping(value="loging.html", method=RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("userLogin") UserLogin userLogin, BindingResult result, Model model) 
	{
		boolean found = userService.findByLogin(userLogin.getUserName(), userLogin.getPassword());
		if (found) 
		{	
			// calling getAllUser method of userService interface and storing in list of user type
			List<User> user2=(List<User>) userService.getAllUser();			
			return new ModelAndView("iplteamlist","user",user2);
		} 
		else
		{
			// calling getAllUser method of userService interface and storing in list of user type
			List<User> user2=(List<User>) userService.getAllUser();
			return new ModelAndView("login","user",user2);
		}
	}
		
}


