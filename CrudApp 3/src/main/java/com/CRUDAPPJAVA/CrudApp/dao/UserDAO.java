package com.CRUDAPPJAVA.CrudApp.dao;

import java.util.*;

import com.CRUDAPPJAVA.CrudApp.model.User;

public interface UserDAO {
    List<User> getAllUsers();

    User findUserById(int theId);

    User saveUser(User theUser);

    void deleteUserById(int theId);
}
