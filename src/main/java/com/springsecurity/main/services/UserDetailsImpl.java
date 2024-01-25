package com.springsecurity.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.springsecurity.main.dao.UserDetailsRepo;
import com.springsecurity.main.entites.UserDe;

@Component
public class UserDetailsImpl implements UserDetailsService {
	
	@Autowired
	UserDetailsRepo userDetailsRepo;
	
	public UserDe addUser(UserDe userDetails) {
		userDetails.setUserPassword(new BCryptPasswordEncoder().encode(userDetails.getUserPassword()));
		return userDetailsRepo.save(userDetails);
		
	}
	public Iterable<UserDe> allusers() {
	return	userDetailsRepo.findAll();
	}
	
}
