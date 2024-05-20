package com.leonardojsusfig.roleforgeapi.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.leonardojsusfig.roleforgeapi.DTO.CharacterSheetDTO;
import com.leonardojsusfig.roleforgeapi.model.CharacterSheet;
import com.leonardojsusfig.roleforgeapi.services.CharacterService;

@RestController
@RequestMapping("/character")
public class CharacterController {
    
    @Autowired
    private CharacterService characterService;

    @GetMapping()
    public ArrayList<CharacterSheet> getAllCharacters(@RequestParam String id){
        return characterService.getAllCharacters(id);
    }

    @DeleteMapping()
    public void deleteCharacter(@RequestParam String id){
        characterService.deleteCharacter(id);
    }

    @PostMapping()
    public void postCharacter(@RequestBody CharacterSheetDTO character){
        characterService.postCharacter(character);
    }

    @PutMapping()
    public void putCharacter(@RequestBody CharacterSheetDTO character){
        characterService.putCharacter(character);
    }
}
