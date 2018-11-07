package com.cdemo.demo06.controller;

import com.cdemo.demo06.bean.Department;
import com.cdemo.demo06.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Charlie Tian
 * @date 11/7/18
 */
@RestController
public class DeptController {
    @Autowired
    DepartmentMapper departmentMapper;

    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id) {
        return departmentMapper.getDepartment(id);
    }

    @GetMapping("/dept")
    public Department getDepartment(Department department) {
        departmentMapper.addDepartment(department);
        return department;
    }
}
