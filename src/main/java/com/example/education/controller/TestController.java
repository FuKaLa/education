package com.example.education.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

/**
 * Created by Administrator on 2019/6/5.
 */
@Controller
//@RequestMapping("/test")
public class TestController {

    @RequestMapping("/Hi")
     public ModelAndView sayHello() {

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("index");

        modelAndView.addObject("key", 12345);

        //System.out.println("test");

        return modelAndView;

 }

    @RequestMapping("/hello")
    public String helloHtml(){
        return"/index";
    }


}
