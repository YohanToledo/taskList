package com.yohan.taskList.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.yohan.taskList.dto.UserDTO;
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
	public ResponseEntity<Void> saveUser(@RequestBody UserDTO userDTO) {
    	User user = service.saveUser(userDTO);
    	URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
    	return ResponseEntity.created(uri).build();
	}
}
