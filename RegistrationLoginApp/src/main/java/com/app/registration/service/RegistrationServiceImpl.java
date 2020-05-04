package com.app.registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.registration.entity.User;
import com.app.registration.repository.ApplicationRepository;

@Service
public class RegistrationServiceImpl implements IRegistratonService {
     
	@Autowired
	ApplicationRepository repository;

	@Override
	public List<?> getAllUsers() {
		return repository.findAll();
	}

	@Override
	public void registerNewUser(User newUser) {
		repository.save(newUser);
	}

	

	
}
