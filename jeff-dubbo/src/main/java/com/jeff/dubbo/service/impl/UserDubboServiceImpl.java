package com.jeff.dubbo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jeff.dubbo.service.UserDubboService;
import com.jeff.mapper.UserMapper;
import com.jeff.pojo.EasyUIDatagrid;
import com.jeff.pojo.User;

@Service
public class UserDubboServiceImpl implements UserDubboService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public EasyUIDatagrid selByPage(User user, int rows, int page) {

        PageHelper.startPage(page, rows);
        // 查询全部
        List<User> list = userMapper.selByPage(user);
        // 分页代码
        // 设置分页条件
        PageInfo<User> pi = new PageInfo<>(list);
        EasyUIDatagrid datagrid = new EasyUIDatagrid();
        datagrid.setRows(pi.getList());
        datagrid.setTotal(pi.getTotal());

        return datagrid;
    }

    @Override
    public boolean insUser(User user) {

        return userMapper.insUser(user) > 0;
    }

    @Override
    public boolean delUser(int id) {

        return userMapper.delUser(id) > 0;
    }

    @Override
    public User selUserById(int id) {

        return userMapper.selUserById(id);
    }

    @Override
    public boolean updUser(User user) {

        return userMapper.updUser(user) > 0;
    }

}
