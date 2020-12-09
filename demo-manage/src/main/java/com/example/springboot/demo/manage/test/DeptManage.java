package com.example.springboot.demo.manage.test;

import com.example.springboot.demo.test.vo.DeptVO;

import java.util.List;

/**
 * @author yujie
 */
public interface DeptManage {

    /**
     * 查询所有
     * @return 返回所有的部门信息
     */
    List<DeptVO> listAll();

}
