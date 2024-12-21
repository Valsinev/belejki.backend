package com.belejki.backend.dao;

import com.belejki.backend.entity.User;

import java.util.List;

public interface UserDAO {

    void save(User theUser);
    User findById(long id);
    List<User> findAll();
    void removeById(long id);
}
