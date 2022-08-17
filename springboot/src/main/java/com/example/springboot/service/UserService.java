package com.example.springboot.service;

import com.example.springboot.models.ResponseObject;
import com.example.springboot.models.ResponseObject3;
import com.example.springboot.models.Users;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<Users> getAllUser();
//    ResponseObject findUserById(Integer id);
//    ResponseObject findByUserName(String userName);
    Optional<Users> getById(int id);
    ResponseObject insertUser(Users newUser);
    ResponseObject updateUser(Users newUser,Integer id);
    ResponseObject deleteUser(Integer id);
    ResponseObject3 checkSummit(String userName, String pass);
}
