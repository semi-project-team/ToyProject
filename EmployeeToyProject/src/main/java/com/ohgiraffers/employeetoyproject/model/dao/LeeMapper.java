package com.ohgiraffers.employeetoyproject.model.dao;

import com.ohgiraffers.employeetoyproject.model.dto.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LeeMapper {
    List<DepartmentDTO> departmentInfo();

    List<EmpJobDTO> findEmpByDeptCode(String deptCode);

    List<JobDTO> jobInfo();

    String findLastId();

    int registMember(EmployeeDTO newEmp);

    List<SalDTO> findSal();

    EmployeeDTO getMember(String id);
}
