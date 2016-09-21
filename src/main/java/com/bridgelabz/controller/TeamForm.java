package com.bridgelabz.controller;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


import com.bridgelabz.model.Team;
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
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/teamform.html")
public class TeamForm 
{
	//autowiring helps to inject a specific object 
	@Autowired
	private Validator validator;

	//autowiring helps to inject a specific object 
	@Autowired
	private UserService userService;
	@RequestMapping(method = RequestMethod.GET)
	// on clicking on any of the country method will get id of country
	public Team setUpForm(@RequestParam(value="id", required = false) Integer teamId)
	{
		if (teamId == null) 
		{
			return new Team();
		} 
		else 
		{
			return new Team();
		}
	}


	@RequestMapping(value = "teamform.html", method = RequestMethod.POST)
	//update method will check for validation and save the country and return new countryList
	/*public ModelAndView create(Team team, BindingResult result, SessionStatus status)
	{
		// validate method of countryValidator class is called for validation		
		validator.teamvalidation(team, result);
		if (result.hasErrors()) 
		{
			return "teamform";
		}
		else 
		{
			//saveCountry method of worldService class which has implementation in worldserviceImpl class is called 
			userService.saveteam(team);
			status.setComplete();
			//return ;
		}*/
	

	public ModelAndView getCountries() 
	{
		List<Team> teams=(List<Team>) userService.getAllTeams();
		return new ModelAndView("iplteamlist","teams",teams);
	}
	/*@RequestMapping(params = "delete", method = RequestMethod.POST)
	public String delete(Country country, BindingResult result, SessionStatus status)
	{
		// saveCountry method of worldService class which has implementation in worldserviceImpl class is called 
		worldService.deleteCountry(country);
		status.setComplete();
		return "redirect:countryList.html";
	}
*/

}
