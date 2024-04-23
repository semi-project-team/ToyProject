package com.ohgiraffers.employeetoyproject.controller;

import com.ohgiraffers.employeetoyproject.model.dto.EmployeeDTO;
import com.ohgiraffers.employeetoyproject.model.service.JungminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class JungminController {

    private final JungminService jungminService;

    @Autowired
    public JungminController(JungminService jungminService) {
        this.jungminService = jungminService;
    }

    @GetMapping("/jungmin")
    public String jungminPage() {

        return "jungminPage";
    }

    @GetMapping("/list")
    public String findMenuList(Model model) {

        List<EmployeeDTO> employeeList = jungminService.findAllMenus();
        // model 키와 밸류 필요
        model.addAttribute("employeeList", employeeList);

        return "list";
    }

}
