package com.ohgiraffers.employeetoyproject.model.dto;

import lombok.*;

@NoArgsConstructor@AllArgsConstructor@Getter@Setter@ToString
public class RegistMemberDTO {

    private String name;
    private String empNoFirst;
    private String empNoLast;
    private String email;
    private String phone;
    private String deptCode;
    private String jobCode;
    private String salLevel;
}
