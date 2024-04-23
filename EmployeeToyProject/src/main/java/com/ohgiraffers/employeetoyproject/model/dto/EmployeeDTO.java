package com.ohgiraffers.employeetoyproject.model.dto;

import lombok.*;

import java.sql.Date;
@NoArgsConstructor@AllArgsConstructor@Getter@Setter@ToString
public class EmployeeDTO {

    private String id;
    private String name;
    private String empNo;
    private String email;
    private String phone;
    private String deptCode;
    private String jobCode;
    private String salLevel;
    private int salary;
    private double bonus;
    private String managerId;
    private Date hireDate;
    private Date entDate;
    private String entYn;

}
