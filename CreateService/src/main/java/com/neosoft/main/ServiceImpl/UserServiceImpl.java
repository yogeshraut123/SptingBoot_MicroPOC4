package com.neosoft.main.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.main.Repository.UseryogeshRepository;
import com.neosoft.main.model.User;
import com.neosoft.main.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UseryogeshRepository userrepository;

	@Override
	public void savedata(User user) {
		userrepository.save(user);

	}

}
