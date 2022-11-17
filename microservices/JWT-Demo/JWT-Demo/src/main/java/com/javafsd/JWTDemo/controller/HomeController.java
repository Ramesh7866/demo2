 package com.javafsd.JWTDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javafsd.JWTDemo.model.JwtRequest;
import com.javafsd.JWTDemo.model.JwtResponse;
import com.javafsd.JWTDemo.service.UserService;
import com.javafsd.JWTDemo.util.JwtUtility;

@RestController
public class HomeController {

	@Autowired
	private JwtUtility jwtUtility;

	@Autowired
	private UserService userService;

	@Autowired
	private AuthenticationManager authenticationManager;

	@GetMapping("/")
	public String hello() {
		return "Welcome to JavaFSD Spring Security!";
	}

	@PostMapping("/authenticate")
	public JwtResponse authenticate(@RequestBody JwtRequest jwtRequest) throws Exception{
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(
							jwtRequest.getUserName(), 
							jwtRequest.getPassword()
							)
					);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIAL", e);
		}

		final UserDetails userDetails = userService.loadUserByUsername(jwtRequest.getUserName());

		final String token = jwtUtility.generateToken(userDetails);

		return new JwtResponse(token);

	}
}