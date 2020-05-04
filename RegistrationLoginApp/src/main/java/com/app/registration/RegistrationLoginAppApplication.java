package com.app.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.app.registration.entity.User;

@SpringBootApplication
public class RegistrationLoginAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(RegistrationLoginAppApplication.class, args);
	//	User obj=context.getBean(User.class);
		System.out.println("---------------\n--------------------------\n-----------------------------");
		//System.out.println(obj);
	}

}
