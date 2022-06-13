package com.yohan.taskList.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yohan.taskList.model.User;
import com.yohan.taskList.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;

	public List<User> findAll(){
		return repo.findAll();
	}
	
	
	public User saveUser(User user){
		return repo.save(user);
	}
}
