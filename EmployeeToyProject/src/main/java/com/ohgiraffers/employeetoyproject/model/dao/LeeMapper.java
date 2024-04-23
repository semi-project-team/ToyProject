package com.ohgiraffers.employeetoyproject.model.dao;

import com.ohgiraffers.employeetoyproject.model.dto.DepartmentDTO;
import com.ohgiraffers.employeetoyproject.model.dto.EmpJobDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LeeMapper {
    List<DepartmentDTO> departmentInfo();

    List<EmpJobDTO> findEmpByDeptCode(String deptCode);
}
