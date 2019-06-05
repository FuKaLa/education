package com.example.education.utils;


import com.example.education.pojo.*;

public class CreateModel {

    public static KeyStrValInt createKeyStrValInt(String name, Integer value){
        KeyStrValInt result = new KeyStrValInt();
        result.setName(name);
        result.setValue(value);
        return result;
    }

    public static KeyStrValDouble createKeyStrValDouble(String name, Double value){
        KeyStrValDouble result = new KeyStrValDouble();
        result.setName(name);
        result.setValue(value);
        return result;
    }

    public static ListMapAnalysis createListMapAnalysis(String xAxis, String yAxis, Integer value) {
        ListMapAnalysis result = new ListMapAnalysis();
        result.setxAxis(xAxis);
        result.setyAxis(yAxis);
        result.setData(value);
        return result;
    }

    public static ListMapAnalysisString createListMapAnalysisString(String xAxis, String yAxis, String value) {
        ListMapAnalysisString result = new ListMapAnalysisString();
        result.setxAxis(xAxis);
        result.setyAxis(yAxis);
        result.setData(value);
        return result;
    }

    public static ListMapAnalysisDouble createListMapAnalysis(String xAxis, String yAxis, Double value) {
        ListMapAnalysisDouble result = new ListMapAnalysisDouble();
        result.setxAxis(xAxis);
        result.setyAxis(yAxis);
        result.setData(value);
        return result;
    }
}
