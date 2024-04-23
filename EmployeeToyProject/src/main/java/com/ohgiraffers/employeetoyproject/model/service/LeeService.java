package com.ohgiraffers.employeetoyproject.model.service;

import com.ohgiraffers.employeetoyproject.model.dao.LeeMapper;
import com.ohgiraffers.employeetoyproject.model.dto.DepartmentDTO;
import com.ohgiraffers.employeetoyproject.model.dto.EmpJobDTO;
import org.springframework.stereotype.Service;

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
}
