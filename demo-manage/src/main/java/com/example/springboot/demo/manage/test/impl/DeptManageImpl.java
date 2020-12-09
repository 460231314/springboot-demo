package com.example.springboot.demo.manage.test.impl;

import com.example.springboot.demo.manage.test.DeptManage;
import com.example.springboot.demo.test.DeptService;
import com.example.springboot.demo.test.vo.DeptVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "deptManage")
public class DeptManageImpl implements DeptManage {

    @Resource(name = "deptService")
    private DeptService deptService;

    @Override
    public List<DeptVO> listAll() {
        return deptService.listAll();
    }
}
