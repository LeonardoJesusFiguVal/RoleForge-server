package com.leonardojsusfig.roleforgeapi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.leonardojsusfig.roleforgeapi.model.Users;


public interface UserRepository extends MongoRepository<Users, String>{

    public abstract Users findByUsernameAndPassword(String username, String password);

    @SuppressWarnings("unchecked")
    public abstract Users save(Users user);
}
