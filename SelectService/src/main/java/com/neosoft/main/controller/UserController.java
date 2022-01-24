package com.neosoft.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.main.model.User;
import com.neosoft.main.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userservice;

	@GetMapping("/")
	public Iterable<User> fetchdata() {

		Iterable<User> list = userservice.getAllData();

		return list;

	}

	@GetMapping("/{userId}")
	public Iterable singledata(@PathVariable("userId") int userId) {
		Iterable<User> user = userservice.logincheck(userId);

		return user;
	}

}
