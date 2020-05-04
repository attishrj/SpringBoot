package com.app.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.registration.dto.LoginRequestDto;
import com.app.registration.dto.LoginResponseDto;
import com.app.registration.service.LoginServiceImpl;

@RestController
public class LoginController {
	
	@Autowired
	LoginServiceImpl loginService;
	
	 @RequestMapping(value = "/login", method = RequestMethod.POST)
	  public ResponseEntity<LoginResponseDto> Login(@RequestBody LoginRequestDto loginDto)
	  {
		   LoginResponseDto response = loginService.findByUsernameAndPassword(loginDto) ; 
		
			  return new ResponseEntity<LoginResponseDto>(response,HttpStatus.ACCEPTED);
	  }

}
