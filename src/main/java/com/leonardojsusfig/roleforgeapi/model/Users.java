package com.leonardojsusfig.roleforgeapi.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Users")
public class Users {
    private String id;
    private String username;
    private String password;
}
