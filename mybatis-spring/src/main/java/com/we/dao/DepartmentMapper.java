package com.we.dao;

import com.we.bean.Department;
import java.util.List;


public interface DepartmentMapper {

    int deleteByPrimaryKey (Integer deptId);

    int insert (Department record);

    int insertSelective (Department record);

    List<Department> selectByMap (Object o);
}