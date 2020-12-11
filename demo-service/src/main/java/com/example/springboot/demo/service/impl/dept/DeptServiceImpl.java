package com.example.springboot.demo.service.impl.dept;

import com.example.springboot.demo.entity.dept.Dept;
import com.example.springboot.demo.mapper.dept.DeptMapper;
import com.example.springboot.demo.service.dept.DeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yuanrp
 * @since 2020-12-11
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements DeptService {

}
