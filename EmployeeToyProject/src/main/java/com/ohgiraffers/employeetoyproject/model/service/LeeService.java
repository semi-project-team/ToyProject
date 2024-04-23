package com.ohgiraffers.employeetoyproject.model.service;

import com.ohgiraffers.employeetoyproject.model.dao.LeeMapper;
import com.ohgiraffers.employeetoyproject.model.dto.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LeeService {

    private LeeMapper leeMapper;

    public LeeService(LeeMapper leeMapper){
        this.leeMapper=leeMapper;
    }

    public List<DepartmentDTO> departmentInfo() {
        return leeMapper.departmentInfo();
    }

    public List<EmpJobDTO> findEmpByDeptCode(String deptCode) {
        return leeMapper.findEmpByDeptCode(deptCode);
    }

    public List<JobDTO> jobInfo() {
        return leeMapper.jobInfo();
    }

    public String findLastId() {

        return leeMapper.findLastId();
    }

    @Transactional
    public int registMember(EmployeeDTO newEmp) {

        return leeMapper.registMember(newEmp);
    }

    public List<SalDTO> findSal() {
        return leeMapper.findSal();
    }
}
