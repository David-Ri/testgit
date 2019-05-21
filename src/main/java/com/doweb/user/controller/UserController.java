package com.doweb.user.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.doweb.user.service.User;
import com.doweb.user.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		Date date = new Date();
		
		int userId = Integer.parseInt("1");
		User user = userService.getUserById(userId);
		
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>Test select</div><br><br>"
				+ "<br><div style='text-align:center;'>" + ft.format(date) +" " + user.getUserName() + " age " +user.getAge() +  "</div>";
		
		insertUser();
		
		return new ModelAndView("welcome", "message", message);
	}
	
	/**
	 * test insert
	 */
	private void insertUser(){
		// test insert
		User user = new User();
		user.setAge(66);
		user.setId(1001);
		user.setPassword("1234");
		user.setUserName("test0005");
		
		
		int ret = userService.insertUser(user);
	}
}
