package com.springsecurity.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurity.main.entites.UserDe;
import com.springsecurity.main.services.UserDetailsService;

@RestController
@RequestMapping("/userdetails")
public class UserDetailsController {
	@Autowired
	UserDetailsService userDetailsService;
	
	@PostMapping("/add")
	public UserDe addUserDetails(@RequestBody UserDe userDetails) {
	return	userDetailsService.addUser(userDetails);
	}
	@GetMapping("/getall")
	public Iterable<UserDe> getAllUser() {
		return userDetailsService.allusers();
	}

}
