package com.example.springbootrestfulwebservices.service;

import com.example.springbootrestfulwebservices.entity.User;
import com.example.springbootrestfulwebservices.entity.UserDto;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto user);

    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();

    UserDto updateUser(UserDto user);

    void deleteUser(Long userId);
}
