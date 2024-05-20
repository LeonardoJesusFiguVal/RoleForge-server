package com.leonardojsusfig.roleforgeapi.DTO;

import java.util.ArrayList;

import com.leonardojsusfig.roleforgeapi.model.CharacterFile;

import lombok.Data;

@Data
public class CharacterSheetDTO {
    private String user;
    private String system;
    private ArrayList<CharacterFile> characterFile;
    private String name;
    private String id;
}
