package com.app.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.registration.entity.User;
import com.app.registration.service.RegistrationServiceImpl;

@RestController
public class UserController {

	@Autowired
	RegistrationServiceImpl userService;

	/*
	 * @GetMapping public String hello() { return "This is Home page"; }
	 */
	 

	 @RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<?> registerNewUser(@RequestBody User newuser) {
		userService.registerNewUser(newuser);
		return new ResponseEntity<User>(HttpStatus.ACCEPTED);
	}
}
