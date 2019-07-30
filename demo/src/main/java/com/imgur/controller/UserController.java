package com.imgur.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.imgur.model.User;
import com.imgur.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/create")
	public ResponseEntity createUser(@RequestBody User user){
		User userResponse = userService.createUser(user);
		if(null!=userResponse){
			return new ResponseEntity<>(HttpStatus.OK);
		}
		
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

	@RequestMapping("/view/{userName}")
	public User viewUser(@PathVariable("userName") String userName){
		return userService.getUser(userName);
	}
	
}
