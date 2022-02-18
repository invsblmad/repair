package com.community.repair.services;

import com.community.repair.DTO.UserDto;
import com.community.repair.entities.User;
import com.community.repair.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(UserDto userDto) {
        User user = new User(userDto);
        return userRepository.save(user);
    }

    public User getById(Integer id) {
        return userRepository.findById(id).get();
    }

    public User getByLogin(String login) {
        return userRepository.findByLogin(login).get();
    }

    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
