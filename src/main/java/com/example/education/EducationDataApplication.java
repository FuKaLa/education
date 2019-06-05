package com.example.education;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.education.dao")
public class EducationDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(EducationDataApplication.class, args);
		System.out.println("==============启动完成");
	}

}
