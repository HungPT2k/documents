package com.example.springboot.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Admins {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int adminId;
    private String userNameAdmin;
    private String passAdmin;
    public Admins(){}
    public Admins(String userNameAdmin, String passAdmin) {
        this.userNameAdmin = userNameAdmin;
        this.passAdmin = passAdmin;
    }

    public String getUserNameAdmin() {
        return userNameAdmin;
    }

    public void setUserNameAdmin(String userNameAdmin) {
        this.userNameAdmin = userNameAdmin;
    }

    public String getPassAdmin() {
        return passAdmin;
    }

    public void setPassAdmin(String passAdmin) {
        this.passAdmin = passAdmin;
    }
}
