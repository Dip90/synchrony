package com.imgur.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imgur.model.User;
import com.imgur.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public User createUser(User user){
		return repository.save(user);
	}

	public User getUser(String userName){
		return repository.getUser(userName);
	}

}
