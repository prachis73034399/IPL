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
@RestController
public class UserController 
{
	
	@Autowired
	private UserService userService;
	private Validator validator;
	@RequestMapping(value="/signup", method=RequestMethod.GET)
	public ModelAndView signup(Model model) 
	{	
		List<User> user2=(List<User>) userService.getAllUser();
		User user = new User();		
		model.addAttribute("user", user);
		return new ModelAndView("signup","user",user2);
	}
	@RequestMapping(value="hi.html",  method=RequestMethod.POST)
	public ModelAndView signup(User userer, BindingResult result, Model model) 
	{	
		/*validator.validate(user, result);
		if(result.hasErrors())
		{
			List<User> user2=(List<User>) userService.getAllUser();
			
			return new ModelAndView("signup","user",user2);
		} 
		else
		{*/
			userService.saveUser(userer);
			System.out.println("Data Saved");
			model.addAttribute("userLogin", userer);
			List<User> user1=(List<User>) userService.getAllUser();
			
			return new ModelAndView("login","user",user1);
		//}
		
	}

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView login(Model model) 
	{	
		List<User> user2=(List<User>) userService.getAllUser();
		UserLogin userLogin = new UserLogin();		
		model.addAttribute("userLogin", userLogin);
		return new ModelAndView("login","user",user2);
	}
	
	@RequestMapping(value="hieee.html", method=RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("userLogin") UserLogin userLogin, BindingResult result, Model model) 
	{
		/*if (result.hasErrors()) 
		{
			return "login";
		}
		else 
		{*/
		
		String loginusername =userLogin.getUserName();
		String loginpassword =userLogin.getPassword();
		System.out.println("Loginusername"+loginusername+" LoginPassword"+loginpassword);
		System.out.println("sddsf");
//			/model.addAttribute("userLogin", userLogin);
			boolean found = userService.findByLogin(userLogin.getUserName(), userLogin.getPassword());
			if (found) 
			{	List<User> user2=(List<User>) userService.getAllUser();			
				return new ModelAndView("iplteamlist","user",user2);
			} else
			{
				List<User> user2=(List<User>) userService.getAllUser();
				return new ModelAndView("login","user",user2);
			}
		}
		
	}


