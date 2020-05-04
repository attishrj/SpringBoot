package com.app.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.registration.entity.User;

@Repository
public interface ApplicationRepository extends JpaRepository<User,String> {
User findByEmailidAndPassword(String username,String password) throws RuntimeException;
	

}
