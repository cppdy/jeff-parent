package com.jeff.service;

import com.jeff.pojo.EasyUIDatagrid;
import com.jeff.pojo.User;

public interface UserService {

    EasyUIDatagrid selByPage(User user, int rows, int page);

    boolean insUser(User user);

    boolean delUser(int id);

    User selUserById(int id);

    boolean updUser(User user);

}
