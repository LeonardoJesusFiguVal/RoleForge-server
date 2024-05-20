package com.leonardojsusfig.roleforgeapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardojsusfig.roleforgeapi.DTO.UserDTO;
import com.leonardojsusfig.roleforgeapi.model.Users;
import com.leonardojsusfig.roleforgeapi.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Users getUser(UserDTO user) {
        return userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
    }

    public void putUser(UserDTO userDto) {
        Users user = userRepository.findByUsernameAndPassword(userDto.getUsername(), userDto.getPassword());

        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());

        userRepository.save(user);
    }

    public void postUser(UserDTO userDto) {
        Users user = new Users();
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());

        userRepository.save(user);
    }
}
