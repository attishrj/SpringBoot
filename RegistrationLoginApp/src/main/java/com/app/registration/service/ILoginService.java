package com.app.registration.service;

import java.util.Optional;

import com.app.registration.dto.LoginRequestDto;
import com.app.registration.dto.LoginResponseDto;
import com.app.registration.entity.User;

public interface ILoginService {
	public LoginResponseDto findByUsernameAndPassword(LoginRequestDto loginDto) throws RuntimeException;
	 
	public Optional<User> editUser(String email);
	

}