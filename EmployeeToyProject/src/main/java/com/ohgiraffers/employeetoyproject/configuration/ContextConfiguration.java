package com.ohgiraffers.employeetoyproject.configuration;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.util.Locale;

@Configuration
@ComponentScan(basePackages = "com.ohgiraffers.employeetoyproject")
@MapperScan(basePackages = "com.ohgiraffers.employeetoyproject", annotationClass = Mapper.class)
public class ContextConfiguration {

    @Bean
    public ReloadableResourceBundleMessageSource messageSource(){
        ReloadableResourceBundleMessageSource source = new ReloadableResourceBundleMessageSource();
        source.setBasename("classpath:messages/message");
        source.setDefaultEncoding("UTF-8");
        Locale.setDefault(Locale.KOREA);
        return source;
    }

}
