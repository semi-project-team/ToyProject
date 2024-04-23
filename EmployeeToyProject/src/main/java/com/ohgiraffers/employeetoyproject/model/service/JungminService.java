package com.ohgiraffers.employeetoyproject.model.service;

import com.ohgiraffers.employeetoyproject.model.dao.JungminMapper;
import com.ohgiraffers.employeetoyproject.model.dto.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JungminService {

    private final JungminMapper jungminMapper;

    @Autowired
    public JungminService(JungminMapper jungminMapper) {
        this.jungminMapper = jungminMapper;
    }
    public List<EmployeeDTO> findAllMenus() {

        return jungminMapper.findAllMenus();
    }
}
