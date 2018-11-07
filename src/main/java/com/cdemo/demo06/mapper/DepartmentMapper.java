package com.cdemo.demo06.mapper;

import com.cdemo.demo06.bean.Department;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @author Charlie Tian
 * @date 11/7/18
 */
//@Mapper
public interface DepartmentMapper {
    @Select("select * from department where id = #{id}")
    Department getDepartment(Integer Id);

    @Insert("insert into department(id, name) values (#{id}, #{name}) ")
    int addDepartment(Department department);

    @Update("update department set name=#{name} where id= #{id} ")
    int updateDepartment(Department department);
}
