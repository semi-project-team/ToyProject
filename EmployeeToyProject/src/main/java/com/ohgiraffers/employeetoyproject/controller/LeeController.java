package com.ohgiraffers.employeetoyproject.controller;

import com.ohgiraffers.employeetoyproject.model.dto.*;
import com.ohgiraffers.employeetoyproject.model.service.LeeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

@Controller
@RequestMapping("/lee")
public class LeeController {

    private final static Logger logger = LogManager.getLogger(LeeController.class);
    private final MessageSource messageSource;
    private final LeeService leeService;
    @Autowired
    public LeeController(LeeService leeService,MessageSource messageSource){
        this.messageSource=messageSource;
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
    @GetMapping("/insert")
    public void insert(){}

    @GetMapping(value = "/jobCode",produces = "application/json; charset='UTF-8'")
    @ResponseBody
    public List<JobDTO> jobDTOS(){
        return leeService.jobInfo();
    }

    @PostMapping("/insert")
    public String regist(@ModelAttribute RegistMemberDTO registMemberDTO, RedirectAttributes rttr, Locale locale){

        String lastId = leeService.findLastId();
        int id = Integer.parseInt(lastId)+1;

        EmployeeDTO newEmp = new EmployeeDTO();
        newEmp.setId(String.valueOf(id));
        newEmp.setName(registMemberDTO.getName());
        newEmp.setEmpNo(registMemberDTO.getEmpNoFirst()+"-"+registMemberDTO.getEmpNoLast());
        newEmp.setEmail(registMemberDTO.getEmail());
        newEmp.setPhone(registMemberDTO.getPhone());
        newEmp.setDeptCode(registMemberDTO.getDeptCode());
        newEmp.setJobCode(registMemberDTO.getJobCode());
        newEmp.setHireDate(Date.valueOf(LocalDate.now()));
        newEmp.setSalLevel(registMemberDTO.getSalLevel());
        int result = leeService.registMember(newEmp);

        if(result>0){
            rttr.addFlashAttribute("successMessage",messageSource.getMessage("successRegist",new Object[]{newEmp.getId(),newEmp.getName()},locale));
        }
        else{
            rttr.addFlashAttribute("failMessage",messageSource.getMessage("failMessage",null,locale));
        }

        return "redirect:/list";
    }
    @GetMapping(value = "/salLevel", produces = "application/json; charset='UTF-8'")
    @ResponseBody
    public List<SalDTO> salDTOS(){
        return  leeService.findSal();
    }

}
