package com.ohgiraffers.employeetoyproject.configuration;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.ohgiraffers.employeetoyproject", annotationClass = Mapper.class)
public class EmployeeToyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeToyProjectApplication.class, args);
	}

}
