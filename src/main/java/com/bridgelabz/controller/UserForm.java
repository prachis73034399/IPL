package com.bridgelabz.controller;


import java.text.SimpleDateFormat;
import java.util.Date;
import com.bridgelabz.model.User;
import com.bridgelabz.service.UserService;
import com.bridgelabz.validator.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;


@Controller
@RequestMapping("/countryForm.html")
public class UserForm 
{
	//autowiring helps to inject a specific object 
	@Autowired
	private Validator validator;

	//autowiring helps to inject a specific object 
	@Autowired
	private UserService userService;
	@RequestMapping(method = RequestMethod.GET)
	// on clicking on any of the country method will get id of country
	public User setUpForm(@RequestParam(value="id", required = false) Integer countryId)
	{
		if (countryId == null) 
		{
			return new User();
		} 
		else 
		{
			return (User) userService.getUserById(countryId);
		}
	}


	@RequestMapping(params = "submit", method = RequestMethod.POST)
	//update method will check for validation and save the country and return new countryList
	public String submit(User user, BindingResult result, SessionStatus status)
	{
		// validate method of countryValidator class is called for validation		
		validator.validate(user, result);
		if (result.hasErrors()) 
		{
			return "signup";
		}
		else 
		{
			//saveCountry method of worldService class which has implementation in worldserviceImpl class is called 
			userService.saveUser(user);
			status.setComplete();
			return "redirect:index.jsp";
		}
	}

	/*@RequestMapping(params = "delete", method = RequestMethod.POST)
	public String delete(Country country, BindingResult result, SessionStatus status)
	{
		// saveCountry method of worldService class which has implementation in worldserviceImpl class is called 
		worldService.deleteCountry(country);
		status.setComplete();
		return "redirect:countryList.html";
	}*/


}
