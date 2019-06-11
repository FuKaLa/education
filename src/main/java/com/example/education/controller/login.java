package com.example.education.controller;

import com.example.education.entity.UserIO;
import com.example.education.service.LoginService;
import com.example.education.utils.R;
import com.example.education.utils.Tool;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2019/6/5.
 */
@CrossOrigin
//@CrossOrigin(origins = "http://192.168.1.114:8080", maxAge = 3600)
@Controller
public class login {

    @Autowired
    private LoginService loginService;

    @ResponseBody
    @RequestMapping("/login")
    public R checkUser(@RequestBody UserIO user, HttpServletRequest request, HttpServletResponse response){

        if(StringUtils.isNotEmpty(user.getUserName()) && StringUtils.isNotEmpty(user.getPassword())
                && user.getRoleId() != null){
            user.setPassword(Tool.MD5(user.getPassword()));
            //判断用户是否存在
            if(loginService.existUser(user)<1){
                return R.error("用户不存在");
            }
            //判断角色是否正确
            if(loginService.checkRole(user.getUserName(),user.getRoleId())<1){
                return R.error("用户角色不正确");
            }
            if(loginService.checkUser(user)<1){
                return R.error("用户密码不正确");
            }
        }else {
            return R.error("用户信息不完整");
        }
        return R.ok();
    }

    /**
     * 用户注册
     * @param user
     * @return
     */
    @ResponseBody
    @RequestMapping("/sign")
    public R save(@RequestBody UserIO user){
            //判断用户是否存在
            if(loginService.existUser(user)>0){
                return R.error("用户名已经存在");
            }
            user.setPassword(Tool.MD5(user.getPassword()));
            Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
//        System.out.println(dateFormat.format(date));
            user.setCreateTime(date);
            if(loginService.save(user)>0){
                return R.ok();
            }
        return R.error();
    }

}
