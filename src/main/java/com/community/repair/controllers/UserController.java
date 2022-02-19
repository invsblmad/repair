package com.community.repair.controllers;

import com.community.repair.DTO.UserDto;
import com.community.repair.entities.User;
import com.community.repair.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/")
    public User save(@RequestBody UserDto userDto) {
        return userService.save(userDto);
    }

    @GetMapping("/all")
    public List<User> getAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable("id") Integer id) {
        return userService.getById(id);
    }

    @GetMapping("/")
    public User getById(@RequestParam String login) {
        return userService.getByLogin(login);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        userService.deleteById(id);
    }
}
