package com.ohgiraffers.employeetoyproject.controller;

import com.ohgiraffers.employeetoyproject.model.dto.DepartmentDTO;
import com.ohgiraffers.employeetoyproject.model.dto.EmpJobDTO;
import com.ohgiraffers.employeetoyproject.model.dto.JobDTO;
import com.ohgiraffers.employeetoyproject.model.service.LeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/lee")
public class LeeController {

    private final LeeService leeService;
    @Autowired
    public LeeController(LeeService leeService){
        this.leeService=leeService;
    }

    @GetMapping
    public String leepage(){
        return "/lee/leeMain";
    }

    @GetMapping("/deptSel")
    public void deptSelPage(){

    }

    @GetMapping(value = "/departmentCode",produces = "application/json; charset='UTF-8'")
    @ResponseBody
    public List<DepartmentDTO> departmentDTOS(){

        return leeService.departmentInfo();
    }

    @GetMapping("/dept-select")
    public String findEmpByDeptCode(@RequestParam String deptCode, Model model){

        
        List<EmpJobDTO> empJob = leeService.findEmpByDeptCode(deptCode);
        model.addAttribute("empInfo",empJob);

        return "/lee/list";

    }


}
