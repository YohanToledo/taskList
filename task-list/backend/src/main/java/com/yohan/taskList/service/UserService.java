package com.yohan.taskList.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.yohan.taskList.dto.UserDTO;
import com.yohan.taskList.model.User;
import com.yohan.taskList.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	public List<User> findAll(){
		return repo.findAll();
	}
	
	
	public User saveUser(UserDTO userDTO){
		User user = new User(userDTO);
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return repo.insert(user);
	}
}
