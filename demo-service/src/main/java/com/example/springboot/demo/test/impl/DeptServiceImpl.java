package com.example.springboot.demo.test.impl;

import com.example.springboot.demo.entity.test.Dept;
import com.example.springboot.demo.mapper.test.DeptMapper;
import com.example.springboot.demo.test.DeptService;
import com.example.springboot.demo.test.vo.DeptVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yujie
 */
@Service(value = "deptService")
public class DeptServiceImpl implements DeptService {

    @Resource
    private DeptMapper deptMapper;

    @Override
    public List<DeptVO> listAll() {
        List<DeptVO> resultList = new ArrayList<>();
        List<Dept> list = deptMapper.listAllDept();
        list.forEach(dept -> {
            DeptVO vo = new DeptVO();
            BeanUtils.copyProperties(dept,vo);
            resultList.add(vo);
        });
        return resultList;
    }
}
