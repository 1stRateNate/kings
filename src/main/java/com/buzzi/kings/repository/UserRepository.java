package com.buzzi.kings.repository;

import com.buzzi.kings.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {
    User getUser(int id);
}
