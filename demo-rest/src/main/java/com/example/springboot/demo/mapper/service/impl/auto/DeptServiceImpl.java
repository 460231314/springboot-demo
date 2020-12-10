package com.example.springboot.demo.mapper.service.impl.auto;

import com.example.springboot.demo.mapper.entity.auto.Dept;
import com.example.springboot.demo.mapper.mapper.auto.DeptMapper;
import com.example.springboot.demo.mapper.service.auto.DeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yuanrp
 * @since 2020-12-10
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements DeptService {

}
