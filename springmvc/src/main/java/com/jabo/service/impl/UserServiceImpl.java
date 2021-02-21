package com.jabo.service.impl;

import com.jabo.mapper.UsersMapper;
import com.jabo.pojo.UserModel;
import com.jabo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UsersMapper bookMapper;

    @Override
    public int addBook(UserModel user) {
        return 0;
    }

    @Override
    public int deleteUserById(int id) {
        return 0;
    }

    @Override
    public int updateBook(UserModel user) {
        return 0;
    }

    @Override
    public UserModel queryUserById(int id) {
        UserModel userModel = bookMapper.queryModelById(id);
        return userModel;
    }

    @Override
    public List<UserModel> queryAllUser() {
        List<UserModel> list = bookMapper.queryAllModel();
        return list;
    }
}
