package com.mochen.yiyuan.mapper;

import com.mochen.yiyuan.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    //添加用户
    int insertUser(User user);

    //删除用户
    int deleteUser(String userID);

    //修改用户-用户
    int updateUser(User user);

    //修改用户-管理员
    int updateUserAdmin(User user);

    //查询所有用户
    List<User> userSelectAll();

    //ID查询
    User userSelectByID(String userID);

    //名字模糊查询
    List<User> userSelectByNameLike(String userName);



}
