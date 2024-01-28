package com.tweteroo.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.dtos.UserDTO;
import com.tweteroo.api.models.UserModel;
import com.tweteroo.api.services.UserService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api/users")
public class UserController {

    final UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public UserModel createUser(@RequestBody @Valid UserDTO body) {
        return userService.create(body);
    }
}
