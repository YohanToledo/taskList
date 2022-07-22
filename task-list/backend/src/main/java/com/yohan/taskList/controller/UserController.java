package com.yohan.taskList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yohan.taskList.model.User;
import com.yohan.taskList.service.UserService;

@RestController
@RequestMapping(value="/users")
public class UserController {
	
	@Autowired
	private UserService service;
	
    @GetMapping(value="/all")
	public ResponseEntity<List<User>> findAll() {
    	List<User> list = service.findAll();
    	return ResponseEntity.ok().body(list);
	}
	
    @PutMapping(value="/save")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
    	service.saveUser(user);
    	return ResponseEntity.ok().body(user);
	}
}
