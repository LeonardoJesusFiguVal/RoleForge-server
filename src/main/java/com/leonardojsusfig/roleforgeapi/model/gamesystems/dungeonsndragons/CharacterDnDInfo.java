package com.leonardojsusfig.roleforgeapi.model.gamesystems.dungeonsndragons;

import com.leonardojsusfig.roleforgeapi.model.CharacterFile;

import lombok.Data;

/**
 * @author Leonardo Jesús Figueroa Valdivia
 * Java class that store the background and apareance of a character in D&D
 */
@Data
public class CharacterDnDInfo implements CharacterFile {
    private String _name;
    private int _age;
    private String _height;
    private String _weight;
    private String _eyes;
    private String _hair;
    private String _appearance;
    private String _backStory;
    private String _allies;
    private String _aditionalFeatures;
    private String _treasure;
}