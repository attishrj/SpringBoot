package com.app.registration.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.app.registration.dto.LoginRequestDto;
import com.app.registration.dto.LoginResponseDto;
import com.app.registration.entity.User;
import com.app.registration.repository.ApplicationRepository;

@Service
public class LoginServiceImpl  implements ILoginService {
	@Autowired
	public ApplicationRepository repository;

	@Override
	public Optional<User> editUser(String email) {
		return repository.findById(email);
	}

	public void deleteMyUser(String email) {
		repository.deleteById(email);
	}

	@Override
	public LoginResponseDto findByUsernameAndPassword(LoginRequestDto loginDto)  {
		LoginResponseDto loginRespose = new LoginResponseDto();
		try {
			User user= repository.findByEmailidAndPassword(loginDto.getEmailId(), loginDto.getPassword());
			if(null!=user)
			{
				loginRespose.setFirstname(user.getFirstname());
				loginRespose.setLastname(user.getLastname());
				loginRespose.setMessage("Login success");
				loginRespose.setStatus(HttpStatus.ACCEPTED.toString());
				//return ;
			}
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return loginRespose;
	}
   
	
	
}