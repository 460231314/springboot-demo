//package com.example.springboot.demo.mapper.test;
//
//import com.example.springboot.demo.entity.test.Dept;
//import org.apache.ibatis.annotations.Select;
//
//import java.util.List;
//
///**
// * @author yujie
// */
//public interface DeptMapper {
//
//    /**
//     * 表名
//      */
//    String TABLE_NAME = "dept";
//
//    /**
//     * 查询结果集合
//     */
//    String QUERY_FIELDS = "DEPTNO,DNAME,LOC,FLAG";
//
//    /**
//     * 查询所有部门信息
//     *
//     * @return 返回所有的部门信息
//     */
//    List<Dept> listAll();
//
//    @Select({
//            "select " + QUERY_FIELDS,
//            "from " + TABLE_NAME
//    })
//    /**
//     * 查询所有部门机构
//     *
//     * @return 返回所有的部门信息
//     */
//    List<Dept> listAllDept();
//
//}
