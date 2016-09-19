package com.bridgelabz.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.bridgelabz.model.User;
import com.bridgelabz.model.UserLogin;
//import com.bridgelabz.model.StudentLogin;
import com.bridgelabz.service.UserService;
import com.bridgelabz.validator.Validator;

@Controller

public class UserController 
{
	
	@Autowired
	private UserService userService;
	private Validator validator;
		
	@RequestMapping(value="/signup", method=RequestMethod.GET)
	public String signup(Model model) 
	{
		User user = new User();		
		model.addAttribute("user", user);		
		return "signup";
	}
	
	@RequestMapping(value="/signup",  method=RequestMethod.POST)
	public String signup(@Valid @ModelAttribute("student") User user, BindingResult result, Model model) 
	{	
		validator.validate(user, result);
		if(result.hasErrors())
		{
			
			return "signup";
		} 
		else
		{
			userService.saveUser(user);
			System.out.println("Data Saved");
			model.addAttribute("message", "Saved student details");
			return "redirect:login";
		}
	}

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(Model model) {			
		UserLogin studentLogin = new UserLogin();		
		model.addAttribute("studentLogin", studentLogin);
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@Valid @ModelAttribute("studentLogin") UserLogin studentLogin, BindingResult result) 
	{
		if (result.hasErrors()) 
		{
			return "login";
		}
		else 
		{
			boolean found = userService.findByLogin(studentLogin.getUserName(), studentLogin.getPassword());
			if (found) 
			{				
				return "iplteams";
			} else {				
				return "failure";
			}
		}
		
	}
}

