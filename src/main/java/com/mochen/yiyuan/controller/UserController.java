package com.mochen.yiyuan.controller;

import com.mochen.yiyuan.mapper.UserMapper;
import com.mochen.yiyuan.pojo.User;
import com.mochen.yiyuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;

    //添加用户
    @RequestMapping("")
    public String insertUser(User user){
        userService.insertUser(user);
        String id = user.getUserID();
        return "";
    }

    //删除用户
    public String deleteUser(String userID){
        userService.deleteUser(userID);
        return "";
    }

    //修改用户-用户
    public String updateUser(User user){
        userService.updateUser(user);
        return "redirect:/user/userSelectByID";
    }

    //修改用户-管理员
    public String updateUserAdmin(User user){
        userService.updateUserAdmin(user);
        return "";
    }

    //查询所有用户
    @RequestMapping("/userSelectAll")
    public String userSelectAll(Model model){
        List<User> list = userService.userSelectAll();
        model.addAttribute("list",list);
        return "";

    }

    //ID查询-客户端
    @RequestMapping("/userSelectByID")
    public String userSelectByID(HttpSession session, Model model){
        String  userID = (String) session.getAttribute("userID");
        User user = userService.userSelectByID(userID);
        model.addAttribute(user);
        return "";
    }

    //名字模糊查询
    public String userSelectByNameLike(String userName,Model model){
        String userNameLike = "%" + userName + "%";
        List<User> list = userService.userSelectByNameLike(userNameLike);
        model.addAttribute(list);
        return "";
    }
}
