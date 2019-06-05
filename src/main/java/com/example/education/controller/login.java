package com.example.education.controller;

import com.example.education.entity.UserIO;
import com.example.education.service.LoginService;
import com.example.education.utils.R;
import com.example.education.utils.Tool;
import org.apache.catalina.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2019/6/5.
 */
@Controller
public class login {

    @Autowired
    private LoginService loginService;

    @ResponseBody
    @RequestMapping("/login")
    public R checkUser(@RequestBody UserIO user){
        if(StringUtils.isNotEmpty(user.getUserName()) && StringUtils.isNotEmpty(user.getPassword())
                && user.getRoleId() != null){
            user.setPassword(Tool.MD5(user.getPassword()));
            //判断用户是否存在
            if(loginService.existUser(user)<1){
                return R.error("用户不存在");
            }
            if(loginService.checkUser(user)<1){
                return R.error("用户密码不正确");
            }
        }else {
            return R.error("用户信息不完整");
        }
        return R.ok();
    }
}
