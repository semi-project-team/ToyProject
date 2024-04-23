package com.ohgiraffers.employeetoyproject.controller;

import com.ohgiraffers.employeetoyproject.model.dto.EmployeeDTO;
import com.ohgiraffers.employeetoyproject.model.service.JungminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/jungmin")
public class JungminController {

    private final JungminService jungminService;

    @Autowired
    public JungminController(JungminService jungminService) {
        this.jungminService = jungminService;
    }

    @GetMapping()
    public String jungminPage() {

        return "jungmin/jungminPage";
    }

    @GetMapping("list")
    public String findMenuList(Model model) {

        List<EmployeeDTO> employeeList = jungminService.findAllMenus();
        // model 키와 밸류 필요
        model.addAttribute("employeeList", employeeList);

        return "/jungmin/list";
    }

    @GetMapping("/find")
    public void find() {}
    @PostMapping("/findSalary")
    public String findBySalary(@RequestParam int minSalary, @RequestParam int maxSalary, Model model) {

            Map<String,Integer> salRange = new HashMap<>();
            salRange.put("min",minSalary);
            salRange.put("max",maxSalary);
            List<EmployeeDTO> employList = jungminService.findBySalary(salRange);
            model.addAttribute("employeeList", employList);

            return "jungmin/list";

    }


}
