package com.CRUDAPPJAVA.CrudApp.service;

import java.util.*;

import com.CRUDAPPJAVA.CrudApp.model.User;

public interface UserService {
    
    public List<User> findAllUsers();

    public String screenUserById(int theId);

    public User findUserById(int theId);

    public User saveUser(User theUser);

    public int deleteUserById(int theId);
    
}
