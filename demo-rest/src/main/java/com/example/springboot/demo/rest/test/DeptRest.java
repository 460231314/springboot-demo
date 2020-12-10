//package com.example.springboot.demo.rest.test;
//
//import com.example.springboot.demo.manage.test.DeptManage;
//import com.example.springboot.demo.test.vo.DeptVO;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//import java.util.List;
//
///**
// * @author yujie
// */
//@RestController
//public class DeptRest {
//
//    @Resource(name = "deptManage")
//    private DeptManage deptManage;
//
//    @GetMapping("/dept")
//    public ResponseEntity listAll(){
//        List<DeptVO> list = deptManage.listAll();
//        ResponseEntity result = new ResponseEntity(list, HttpStatus.OK);
//        return result;
//    }
//
//}
