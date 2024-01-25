package com.springsecurity.main.services;

import org.springframework.stereotype.Service;

import com.springsecurity.main.entites.UserDe;

@Service
public interface UserDetailsService {
	UserDe addUser(UserDe userDetails);
	Iterable<UserDe> allusers();
}
