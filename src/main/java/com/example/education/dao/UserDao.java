package com.example.education.dao;

import com.example.education.entity.UserIO;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2019/6/5.
 */
@Mapper
@Repository
public interface UserDao {

        int existUser(UserIO user);

        int checkUser(UserIO user);

        int save(UserIO userIO);
}
