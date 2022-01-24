package com.neosoft.main.service;

import com.neosoft.main.model.User;

public interface UserService {

	public Iterable<User> getAllData();

	public Iterable<User> logincheck(int userId);

}
