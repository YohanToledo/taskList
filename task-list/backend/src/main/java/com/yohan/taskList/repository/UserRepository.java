package com.yohan.taskList.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.yohan.taskList.model.User;

public interface UserRepository extends MongoRepository<User, String>{
	
}
