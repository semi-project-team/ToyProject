package com.ohgiraffers.employeetoyproject.configuration;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ohgiraffers.employeetoyproject")
@MapperScan(basePackages = "com.ohgiraffers.employeetoyproject", annotationClass = Mapper.class)
public class ContextConfiguration {
}
