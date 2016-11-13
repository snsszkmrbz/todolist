package com.ballikaya.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ballikaya.todolist.model.User;
import com.ballikaya.todolist.service.service.UserService;

@Controller
public class Home {

	@Autowired
	UserService userService;

	@RequestMapping("/home")
	public String index() {

		User user= new User();
		user.setName("Murat");
		user.setSurname("Ballikaya");
		user.setUserName("mb");
		user.setMail("test");
		user.setPassword("1");
		
		
		userService.saveUser(user);

		return "index";

	}

}
