package com.neosoft.main.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.main.model.User;

@Repository
public interface UseryogeshRepository extends MongoRepository<User, Integer> {

	User findByUserId(int userId);

}
