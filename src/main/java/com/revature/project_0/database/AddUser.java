package com.revature.project_0.database;

import com.revature.project_0.models.AppUser;

import java.sql.*;

public class AddUser {

     private String firstName;
     private String lastName;
     private String username;
     private String password;


    public AddUser(AppUser newUser) {
        this.firstName = newUser.getFirstName();
        this.lastName = newUser.getLastName();
        this.username = newUser.getUsername();
        this.password = newUser.getPassword();
    }


}
