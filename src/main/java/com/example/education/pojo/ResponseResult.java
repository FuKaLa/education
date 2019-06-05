package com.example.education.pojo;

import java.util.List;

public class ResponseResult<T> {

    private String msg;

    private String code;

    private List<T> data;

    public ResponseResult(String code, List<T> data) {
        this.code = code;
        this.data = data;

    }

    public ResponseResult(String code, String msg) {
        this.code = code;
        this.msg = msg;

    }

    public ResponseResult(String code) {
        this.code = code;
    }
}
