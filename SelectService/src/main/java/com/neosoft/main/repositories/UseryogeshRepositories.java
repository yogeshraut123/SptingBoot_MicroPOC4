package com.neosoft.main.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.main.model.User;

@Repository
public interface UseryogeshRepositories extends MongoRepository<User, Integer> {

	public Iterable<User> findByUserId(int userId);

}
