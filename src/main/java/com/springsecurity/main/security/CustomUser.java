package com.springsecurity.main.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.springsecurity.main.entites.UserDe;

import java.util.Arrays;
import java.util.Collection;

public class CustomUser implements UserDetails {
	private final UserDe userDe;

	public CustomUser(UserDe userDe) {
		this.userDe = userDe;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		SimpleGrantedAuthority authority = new SimpleGrantedAuthority(userDe.getUserRole());
		return Arrays.asList(authority);
	}

	@Override
	public String getPassword() {
		return userDe.getUserPassword();
	}

	@Override
	public String getUsername() {
		return userDe.getUserName();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
