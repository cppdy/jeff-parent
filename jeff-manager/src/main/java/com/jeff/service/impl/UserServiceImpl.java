package com.jeff.service.impl;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jeff.dubbo.service.UserDubboService;
import com.jeff.pojo.EasyUIDatagrid;
import com.jeff.pojo.User;
import com.jeff.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Reference
    private UserDubboService userDubboService;

    @Override
    public EasyUIDatagrid selByPage(User user, int rows, int page) {

        return userDubboService.selByPage(user, rows, page);
    }

    @Override
    public boolean insUser(User user) {

        return userDubboService.insUser(user);
    }

    @Override
    public boolean delUser(int id) {

        return userDubboService.delUser(id);
    }

    @Override
    public User selUserById(int id) {

        return userDubboService.selUserById(id);
    }

    @Override
    public boolean updUser(User user) {

        return userDubboService.updUser(user);
    }

}
