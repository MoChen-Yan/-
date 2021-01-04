package com.mochen.yiyuan.controller.adminController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class adminControllerJump {

    @RequestMapping({"/","admin_index"})
    public String toAdminIndex(){ return "admin_index";}

    @RequestMapping("/admin_login")
    public String toAdminLogin(){ return "admin_login";}

    @RequestMapping("/admin_member_list")
    public String toAdminMemberList(){ return "admin_member_list";}

    @RequestMapping("/admin_member_del.html")
    public String toAdminMemberDel(){ return "admin_member_del";}
}
