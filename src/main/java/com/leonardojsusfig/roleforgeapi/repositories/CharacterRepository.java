package com.leonardojsusfig.roleforgeapi.repositories;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.leonardojsusfig.roleforgeapi.model.CharacterSheet;

public interface CharacterRepository extends MongoRepository<CharacterSheet, String> {
    
    public abstract ArrayList<CharacterSheet> findAll();
    public abstract ArrayList<CharacterSheet> findByUser(String user);
    public abstract void deleteById(String id);
    public abstract Optional<CharacterSheet> findById(String id);

    @SuppressWarnings("unchecked")
    public abstract CharacterSheet save(CharacterSheet character);
}
