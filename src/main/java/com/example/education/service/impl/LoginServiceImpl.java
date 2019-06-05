package com.example.education.service.impl;

import com.example.education.dao.UserDao;
import com.example.education.entity.UserIO;
import com.example.education.service.LoginService;
import com.example.education.utils.R;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/6/5.
 */
@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private UserDao loginDao;

    @Override
    public int existUser(UserIO user) {
        return loginDao.existUser(user);
    }

    @Override
    public int checkUser(UserIO user) {
        return loginDao.checkUser(user);
    }
}
