package com.cdemo.demo06.mapper;

import com.cdemo.demo06.bean.Employee;

/**
 * @author Charlie Tian
 * @date 11/7/18
 */
//@Mapper
public interface EmployeeMapper {
    Employee getEmployee(Integer Id);
}
