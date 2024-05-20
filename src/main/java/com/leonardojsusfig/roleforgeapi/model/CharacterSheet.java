package com.leonardojsusfig.roleforgeapi.model;

import java.util.ArrayList;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**
 * Java class that store every information of a certain character.
 * Is wath you receive when do a GET request for character
 * @author Leosnardo Jesús Figueroa Valdivia
 */
@Data
@Document(collection = "Characters")
public class CharacterSheet {
    private String id;
    private String user;
    private String system;
    private ArrayList<CharacterFile> characterFile;
    private String name;
}
