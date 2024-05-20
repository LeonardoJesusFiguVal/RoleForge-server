package com.leonardojsusfig.roleforgeapi.model.gamesystems.dungeonsndragons;

import java.util.ArrayList;

import com.leonardojsusfig.roleforgeapi.model.CharacterFile;

import lombok.Data;

/**
 * Java class tath store the information of the spells of a D&D character
 * @author Leonardo Jesús Figueroa Valdivia
 */
@Data
public class CharacterDnDSpell implements CharacterFile{
    private String _class;
    private int _ability;
    private int _saveDC;
    private int _attackBonus;
    private ArrayList<String> _cantrips0;
    private ArrayList<String> _spells1;
    private ArrayList<String> _spells2;
    private ArrayList<String> _spells3;
    private ArrayList<String> _spells4;
    private ArrayList<String> _spells5;
    private ArrayList<String> _spells6;
    private ArrayList<String> _spells7;
    private ArrayList<String> _spells8;
    private ArrayList<String> _spells9;
}