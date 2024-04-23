package com.ohgiraffers.employeetoyproject.model.dao;

import com.ohgiraffers.employeetoyproject.model.dto.EmployeeDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JungminMapper {

    List<EmployeeDTO> findAllMenus();

}
