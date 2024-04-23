package com.ohgiraffers.employeetoyproject.model.dto;

import lombok.*;

@NoArgsConstructor@AllArgsConstructor@Setter@Getter@ToString
public class EmpJobDTO {

    private String name;
    private String phone;
    private String email;
    private JobDTO jobs;
}
