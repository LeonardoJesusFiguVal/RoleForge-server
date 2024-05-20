package com.leonardojsusfig.roleforgeapi.model.gamesystems.dungeonsndragons;

import java.util.ArrayList;

import com.leonardojsusfig.roleforgeapi.model.CharacterFile;

import lombok.Data;

/**
 * @author Leonardo Jesús Figueroa Valdivia
 * Java class tath store the main information about a D&D character
 */
@Data
public class CharacterDnDFile implements CharacterFile {
    
    private String _name;
    //Class
    private String _class;
    private int _level;
    private String _background;
    private String _playerName;
    private String _race;
    private String _alignment;
    private int _expPoints;
    //Stats
    private int _strength;
    private int _strengthMod;
    private int _dexterity;
    private int _dexterityMod;
    private int _constitution;
    private int _constitutionMod;
    private int _inteligence;
    private int _inteligenceMod;
    private int _wisdom;
    private int _wisdomMod;
    private int _carisma;
    private int _carismaMod;
    private boolean _inspiration;
    private int _proficiencyBonus;
    //Saving Throws
    private ArrayList<String> _favorableSavings;
    private int _saveStrength;
    private int _saveDexterity;
    private int _saveConstitution;
    private int _saveInteligence;
    private int _saveWisdom;
    private int _saveCarsima;
    //Skills
    private ArrayList<String> _favorableSkills;
    private int _acrobatics;
    private int _animalHandling;
    private int _arcana;
    private int _athletics;
    private int _deception;
    private int _history;
    private int _insight;
    private int _intimidation;
    private int _investigation;
    private int _medicine;
    private int _nature;
    private int _perception;
    private int _performance;
    private int _persuasion;
    private int _religion;
    private int _sleightOfHand;
    private int _stealth;
    private int _survival;
    //Pasive Wisdom
    private int _passiveWisdom;
    private int _proficienciesLanguages;
    //Life
    private int _armor;
    private int _initiative;
    private int _speed;
    private int _currentHitpoints;
    private int _maxHitpoints;
    private int _temporaryHitponts;
    private int _hitDice;
    private boolean[] _saveSuccesses;
    private boolean[] _saveFailures;
    private ArrayList<String> _attacks;
    //Equipment
    private ArrayList<String> _backpack;
    private int _equipmentCP;
    private int _equipmentSP;
    private int _equipmentEP;
    private int _equipmentGP;
    private int _equipmentPP;
    //Personality
    private String _personalityTraits;
    private String _personalityIdeals;
    private String _personalityBonds;
    private String _personalityFlaws;
    //Features
    private String _featuresTraits;
}