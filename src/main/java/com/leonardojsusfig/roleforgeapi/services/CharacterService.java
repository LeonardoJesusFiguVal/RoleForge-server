package com.leonardojsusfig.roleforgeapi.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardojsusfig.roleforgeapi.DTO.CharacterSheetDTO;
import com.leonardojsusfig.roleforgeapi.model.CharacterSheet;
import com.leonardojsusfig.roleforgeapi.repositories.CharacterRepository;

@Service
public class CharacterService {
    
    @Autowired
    private CharacterRepository characterRepository;

    public ArrayList<CharacterSheet> getAllCharacters(String userId){
        return characterRepository.findByUser(userId);
    }

    public void deleteCharacter(String id){
        characterRepository.deleteById(id);
    }

    public void postCharacter(CharacterSheetDTO characterDto){

        CharacterSheet character = new CharacterSheet();
        
        character.setSystem(characterDto.getSystem());
        character.setUser(characterDto.getUser());
        character.setCharacterFile(characterDto.getCharacterFile());
        character.setName(characterDto.getName());

        characterRepository.save(character);
    }

    public void putCharacter(CharacterSheetDTO characterDto) {
        Optional<CharacterSheet> optionalCharacter = characterRepository.findById(characterDto.getId());

        if (optionalCharacter.isPresent()) {
            CharacterSheet character = optionalCharacter.get();

            character.setSystem(characterDto.getSystem());
            character.setUser(characterDto.getUser());
            character.setCharacterFile(characterDto.getCharacterFile());
            character.setName(characterDto.getName());

            characterRepository.save(character);
        }
    }

    public ArrayList<CharacterSheet> getCharacters(){
        return characterRepository.findAll();
    }
}
