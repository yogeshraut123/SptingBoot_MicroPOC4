package com.neosoft.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.main.model.User;
import com.neosoft.main.repositories.UseryogeshRepositories;
import com.neosoft.main.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UseryogeshRepositories userrepository;

	@Override
	public Iterable<User> getAllData() {

		return userrepository.findAll();
	}

	@Override
	public Iterable<User> logincheck(int userId) {

		return userrepository.findByUserId(userId);
	}

}
