package com.jeff.mapper;

import java.util.List;

import com.jeff.pojo.User;

public interface UserMapper {

    List<User> selByPage(User user);

    int insUser(User user);

    int delUser(int id);

    User selUserById(int id);

    int updUser(User user);

    User login(User user);

}
