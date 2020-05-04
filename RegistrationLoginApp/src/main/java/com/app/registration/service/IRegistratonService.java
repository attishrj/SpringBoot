package com.app.registration.service;

import java.util.List;

import com.app.registration.entity.User;

public interface IRegistratonService {
	
	public void registerNewUser(User param);
	
	public List<?>  getAllUsers();
	
	
	
}
