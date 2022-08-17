package com.example.springboot.models;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String username;
    private String passWordUser;
    private String fullName;
    private String email;
    private Date birthDay;
    private String addressUser;
    private int roles;
    @JsonIgnore
    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY)
    private List<Booking> bookingList;

//    public Users(){};
//
//    public Users( String username, String passWordUser, String fullName, String email, String birthDay, String addressUser) {
//
//        this.username = username;
//        this.passWordUser = passWordUser;
//        this.fullName = fullName;
//        this.email = email;
//        this.birthDay = birthDay;
//        this.addressUser = addressUser;
//    }
//
//    public int getUserId() {
//        return userId;
//    }
//
//    public void setUserId(int userId) {
//        this.userId = userId;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassWordUser() {
//        return passWordUser;
//    }
//
//    public void setPassWordUser(String passWordUser) {
//        this.passWordUser = passWordUser;
//    }
//
//    public String getFullName() {
//        return fullName;
//    }
//
//    public void setFullName(String fullName) {
//        this.fullName = fullName;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getBirthDay() {
//        return birthDay;
//    }
//
//    public void setBirthDay(String birthDay) {
//        this.birthDay = birthDay;
//    }
//
//    public String getAddressUser() {
//        return addressUser;
//    }
//
//    public void setAddressUser(String addressUser) {
//        this.addressUser = addressUser;
//    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", passWordUser='" + passWordUser + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", addressUser='" + addressUser + '\'' +
                '}';
    }
}
