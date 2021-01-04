package com.mochen.yiyuan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String userID;
    private String userPwd;
    private String userName;
    private int userPhone;
    private double userBalance;


}
