package com.bridgelabz.validator;

import com.bridgelabz.model.User;
import com.bridgelabz.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;


@Component
public class Validator
{
	@Autowired
	private UserService userService;
	public void validate(User user, Errors errors) 
	{
		if (user.getFirstName()!= null) 
		{
			errors.rejectValue("firstName", "validation.notnull", "must be > 0");
		}
		if (user.getLastName()!= null) 
		{
			errors.rejectValue("lastname", "validation.notnull", "must be > 0");
		}
	
		if (!errors.hasFieldErrors("userName")) {
			User existingUser = (User) userService.getUserByName(user.getUserName());
			if (existingUser != null &&
			(user.isNew() ||  user.getUserName() != existingUser.getUserName())) {
			errors.rejectValue("name", "validation.exists", "exists");
			}
			}
	}

}
