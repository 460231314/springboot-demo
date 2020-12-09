package com.example.springboot.demo.mapper.test;

import com.example.springboot.demo.entity.test.Dept;

import java.util.List;

public interface DeptMapper {

    /**
     * 查询所有
     * @return 返回所有的部门信息
     */
    List<Dept> listAll();

}
