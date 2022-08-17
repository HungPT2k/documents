package com.example.springboot.serviceiml;

import com.example.springboot.models.ResponseObject;
import com.example.springboot.models.ResponseObject3;
import com.example.springboot.models.Users;
import com.example.springboot.repositories.UserRepository;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserIml implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<Users> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public Optional<Users> getById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public ResponseObject insertUser(Users newUser) {
        List<Users> foundEmailUer = userRepository.findByEmail(newUser.getEmail());
        List<Users> foundPasswordUer = userRepository.findByPassWordUser(newUser.getPassWordUser());
        if(foundEmailUer.size() >0 || foundPasswordUer.size()>0){
            return new ResponseObject("Fail", " Email or Password is already","");
        }
        else {
            return     new ResponseObject("ok", "Insert User successfully", userRepository.save(newUser));
        }
    }

    @Override
    public ResponseObject updateUser(Users newUser, Integer id) {
        Users updateUser= userRepository.findById(id).map(user -> {
            user.setUsername(newUser.getUsername());
            user.setAddressUser(newUser.getAddressUser());
            user.setBirthDay(newUser.getBirthDay());
            user.setFullName(newUser.getFullName());
            user.setUsername(newUser.getUsername());
            user.setPassWordUser(newUser.getPassWordUser());
            return userRepository.save(user);
        }).orElseGet(()->{
            newUser.setUserId(id);
            return userRepository.save(newUser);}
        );


        return new ResponseObject("Ok", "Update User is successfully",updateUser);
    }

    @Override
    public ResponseObject deleteUser(Integer id) {
        boolean user = userRepository.existsById(id);
        if(user){
            userRepository.deleteById(id);
            return new ResponseObject("ok", "User is  deleted", "");
        }
        return new ResponseObject("Fail", "User is  not already", "");
    }

    @Override
    public ResponseObject3 checkSummit(String userName, String pass) {
        for(Users u: userRepository.findAll()){
            if(u.getUsername().equalsIgnoreCase(userName) && u.getPassWordUser().equalsIgnoreCase(pass)){
                return new ResponseObject3("Ok", "Login  successfully",u,u.getRoles());
            }
        }
         return new ResponseObject3("False", "User or pass is never already",null,2);
    }
}
