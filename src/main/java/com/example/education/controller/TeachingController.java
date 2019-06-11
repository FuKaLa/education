package com.example.education.controller;

import com.example.education.pojo.KeyStrValInt;
import com.example.education.utils.CreateModel;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/6/5.
 * 教学分析
 */
@CrossOrigin
@Controller
public class TeachingController {


    /**
     * 课程导向
     * @param type
     * @return
     */
    @ResponseBody
    @RequestMapping("/course/guide")
    public List<KeyStrValInt> getCourseGuide(Integer type){
        List result1 = new ArrayList();
        result1.add(CreateModel.createKeyStrValInt("云计算", Integer.valueOf(84)));
        result1.add(CreateModel.createKeyStrValInt("大数据", Integer.valueOf(96)));
        result1.add(CreateModel.createKeyStrValInt("后端开发", Integer.valueOf(84)));
        result1.add(CreateModel.createKeyStrValInt("前端设计", Integer.valueOf(79)));
        result1.add(CreateModel.createKeyStrValInt("网络工程", Integer.valueOf(78)));
        result1.add(CreateModel.createKeyStrValInt("人工智能", Integer.valueOf(90)));

        List result2 = new ArrayList();
        result2.add(CreateModel.createKeyStrValInt("会计", Integer.valueOf(70)));
        result2.add(CreateModel.createKeyStrValInt("审计学", Integer.valueOf(78)));
        result2.add(CreateModel.createKeyStrValInt("税务", Integer.valueOf(90)));
        result2.add(CreateModel.createKeyStrValInt("财管", Integer.valueOf(82)));
        result2.add(CreateModel.createKeyStrValInt("财政学", Integer.valueOf(89)));
        result2.add(CreateModel.createKeyStrValInt("ACCA", Integer.valueOf(92)));

        List result3 = new ArrayList();
        result3.add(CreateModel.createKeyStrValInt("英语", Integer.valueOf(98)));
        result3.add(CreateModel.createKeyStrValInt("日语", Integer.valueOf(85)));
        result3.add(CreateModel.createKeyStrValInt("朝鲜语", Integer.valueOf(4)));
        result3.add(CreateModel.createKeyStrValInt("中澳合作国际商务", Integer.valueOf(86)));
        result3.add(CreateModel.createKeyStrValInt("英国BTEC/HND课程", Integer.valueOf(80)));


        if(type == 1){
            return result1;
        }
        if(type == 2){
            return result2;
        }
        if(type == 3){
            return result3;
        }
    return  result1;
    }


    /**
     * 课程优秀率
     * @param type
     * @return
     */
    @ResponseBody
    @RequestMapping("/course/excellent")
    public List<KeyStrValInt> getCourseExcellent(Integer type){
        List result1 = new ArrayList();
        result1.add(CreateModel.createKeyStrValDouble("云计算", Double.valueOf(20.8)));
        result1.add(CreateModel.createKeyStrValDouble("大数据", Double.valueOf(30.6)));
        result1.add(CreateModel.createKeyStrValDouble("后端开发", Double.valueOf(50.9)));
        result1.add(CreateModel.createKeyStrValDouble("前端设计", Double.valueOf(60.5)));
        result1.add(CreateModel.createKeyStrValDouble("网络工程", Double.valueOf(45.9)));
        result1.add(CreateModel.createKeyStrValDouble("人工智能", Double.valueOf(35.9)));

        List result2 = new ArrayList();
        result2.add(CreateModel.createKeyStrValDouble("会计", Double.valueOf(30.0)));
        result2.add(CreateModel.createKeyStrValDouble("审计学", Double.valueOf(45.7)));
        result2.add(CreateModel.createKeyStrValDouble("税务", Double.valueOf(66.9)));
        result2.add(CreateModel.createKeyStrValDouble("财管", Double.valueOf(56.8)));
        result2.add(CreateModel.createKeyStrValDouble("财政学", Double.valueOf(71.9)));
        result2.add(CreateModel.createKeyStrValDouble("ACCA", Double.valueOf(68.4)));

        List result3 = new ArrayList();
        result3.add(CreateModel.createKeyStrValDouble("英语", Double.valueOf(91.0)));
        result3.add(CreateModel.createKeyStrValDouble("日语", Double.valueOf(40.6)));
        result3.add(CreateModel.createKeyStrValDouble("朝鲜语", Double.valueOf(19.9)));
        result3.add(CreateModel.createKeyStrValDouble("中澳合作国际商务", Double.valueOf(85.0)));
        result3.add(CreateModel.createKeyStrValDouble("英国BTEC/HND课程", Double.valueOf(95.1)));

        if(type == 1){
            return result1;
        }
        if(type == 2){
            return result2;
        }
        if(type == 3){
            return result3;
        }
        return  result1;
    }


    /**
     * 课程合格率
     * @param type
     * @return
     */
    @ResponseBody
    @RequestMapping("/course/qualified")
    public List<KeyStrValInt> getCourseQualified(Integer type){
        List result1 = new ArrayList();
        result1.add(CreateModel.createKeyStrValDouble("云计算", Double.valueOf(79.8)));
        result1.add(CreateModel.createKeyStrValDouble("大数据", Double.valueOf(70.6)));
        result1.add(CreateModel.createKeyStrValDouble("后端开发", Double.valueOf(68.9)));
        result1.add(CreateModel.createKeyStrValDouble("前端设计", Double.valueOf(88.5)));
        result1.add(CreateModel.createKeyStrValDouble("网络工程", Double.valueOf(67.9)));
        result1.add(CreateModel.createKeyStrValDouble("人工智能", Double.valueOf(65.9)));

        List result2 = new ArrayList();
        result2.add(CreateModel.createKeyStrValDouble("会计", Double.valueOf(69.9)));
        result2.add(CreateModel.createKeyStrValDouble("审计学", Double.valueOf(76.7)));
        result2.add(CreateModel.createKeyStrValDouble("税务", Double.valueOf(90.9)));
        result2.add(CreateModel.createKeyStrValDouble("财管", Double.valueOf(71.8)));
        result2.add(CreateModel.createKeyStrValDouble("财政学", Double.valueOf(88.9)));
        result2.add(CreateModel.createKeyStrValDouble("ACCA", Double.valueOf(86.4)));

        List result3 = new ArrayList();
        result3.add(CreateModel.createKeyStrValDouble("英语", Double.valueOf(98.2)));
        result3.add(CreateModel.createKeyStrValDouble("日语", Double.valueOf(86.6)));
        result3.add(CreateModel.createKeyStrValDouble("朝鲜语", Double.valueOf(70.9)));
        result3.add(CreateModel.createKeyStrValDouble("中澳合作国际商务", Double.valueOf(91.0)));
        result3.add(CreateModel.createKeyStrValDouble("英国BTEC/HND课程", Double.valueOf(99.1)));
        if(type == 1){
            return result1;
        }
        if(type == 2){
            return result2;
        }
        if(type == 3){
            return result3;
        }
        return  result1;
    }

}
