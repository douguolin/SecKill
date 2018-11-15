package com.bjpowernode.springboot.service;

import com.bjpowernode.springboot.model.User;

import java.util.List;

public interface UserService {
    List<User> selectAll();

    void insertUser();
}
