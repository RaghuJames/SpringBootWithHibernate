package com.Hibernate.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Hibernate.model.User;
import com.Hibernate.service.UserHomeService;

@RestController
public class HomeController {
	
	@Autowired
	private UserHomeService userHomeService;
	
	@RequestMapping(value="/home.htm",method=RequestMethod.GET)
	private String formBack() {
		User u = new User();
		u.setUserId(1);
		u.setUserName("Raghu");
		this.userHomeService.getUser(u);
		return "Hahaha";
	}
}
