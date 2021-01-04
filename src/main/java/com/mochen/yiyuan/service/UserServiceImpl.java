package com.mochen.yiyuan.service;

import com.mochen.yiyuan.mapper.UserMapper;
import com.mochen.yiyuan.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public int deleteUser(String userID) {
        return userMapper.deleteUser(userID);
    }



    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int updateUserAdmin(User user) {
        return userMapper.updateUserAdmin(user);
    }

    @Override
    public List<User> userSelectAll() {
        return userMapper.userSelectAll();
    }

    @Override
    public User userSelectByID(String userID) {
        return userMapper.userSelectByID(userID);
    }

    @Override
    public List<User> userSelectByNameLike(String userName) {
        return userMapper.userSelectByNameLike(userName);
    }
}
