package com.ohgiraffers.employeetoyproject.global;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(NullPointerException.class)
    public String noMember(){


        return "error/noMember";
    }
}
