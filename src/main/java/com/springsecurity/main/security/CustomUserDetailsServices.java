package com.springsecurity.main.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.springsecurity.main.dao.UserDetailsRepo;
import com.springsecurity.main.entites.UserDe;

@Service
public class CustomUserDetailsServices implements UserDetailsService {

	private final UserDetailsRepo userDetailsRepo;

	@Autowired
	public CustomUserDetailsServices(UserDetailsRepo userDetailsRepo) {
		this.userDetailsRepo = userDetailsRepo;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDe userDe = userDetailsRepo.getuserbyname(username);
		if (userDe == null) {
			throw new UsernameNotFoundException("Username not found");
		} else {
			return new CustomUser(userDe);
		}
	}
}
