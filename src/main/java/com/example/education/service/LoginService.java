package com.example.education.service;

import com.example.education.entity.UserIO;
import com.example.education.utils.R;
import org.apache.catalina.User;

/**
 * Created by Administrator on 2019/6/5.
 */
public interface LoginService {

   int  existUser(UserIO user);

   int checkRole(String username,Integer roleId);

   int checkUser(UserIO user);

   int save(UserIO userIO);
}
