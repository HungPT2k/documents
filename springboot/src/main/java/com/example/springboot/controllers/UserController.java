package com.example.springboot.controllers;

import com.example.springboot.models.ResponseObject;
import com.example.springboot.models.ResponseObject3;
import com.example.springboot.models.Users;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping(path = "/")
    List<Users> getAllUser(){
        return userService.getAllUser();
    }
    @GetMapping("/{id}")
    Optional<Users> getbyId(@PathVariable int id){
        return userService.getById(id);
    }
    @GetMapping(path = "/login/{userName}/{pass}")
    ResponseEntity<ResponseObject3> CheckLogin(@PathVariable String userName, @PathVariable String pass){
         return ResponseEntity.status(HttpStatus.OK).body(userService.checkSummit(userName,pass));
    }
    @PostMapping(path = "/insert")
    ResponseEntity<ResponseObject> InsertUser(@RequestBody Users newUser){
        return ResponseEntity.status(HttpStatus.OK).body(userService.insertUser(newUser));
    }
    @PutMapping(path = "/{id}")
    ResponseEntity<ResponseObject> UpdateUser(@RequestBody Users newUser,@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(userService.updateUser(newUser,id));
    }
    @DeleteMapping(path = "/{id}")
    ResponseEntity<ResponseObject> DeleteUser(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(userService.deleteUser(id));
    }
}
