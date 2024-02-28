package com.garvit.onlinebookstore.service;

import java.util.List;

import com.garvit.onlinebookstore.entity.User;

public interface UserService {

	public List<User> getAllUsers();
	
	public User getUserByUsername(String username);
}
