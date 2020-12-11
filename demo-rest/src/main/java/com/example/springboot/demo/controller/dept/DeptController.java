package com.example.springboot.demo.controller.dept;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.example.springboot.demo.service.dept.DeptService;
import com.example.springboot.demo.entity.dept.Dept;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yuanrp
 * @since 2020-12-11
 */
@Controller
@RequestMapping("/dept")
public class DeptController {


    @Autowired
    private DeptService deptService;

    @GetMapping(value = "/")
    public ResponseEntity<Page<Dept>> list(@RequestParam(required = false) Integer current, @RequestParam(required = false) Integer pageSize) {
        if (current == null) {
            current = 1;
        }
        if (pageSize == null) {
            pageSize = 10;
        }
        Page<Dept> aPage = deptService.page(new Page<>(current, pageSize));
        return new ResponseEntity<>(aPage, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Dept> getById(@PathVariable("id") String id) {
        return new ResponseEntity<>(deptService.getById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Object> create(@RequestBody Dept params) {
        deptService.save(params);
        return new ResponseEntity<>("created successfully", HttpStatus.OK);
    }

    @PostMapping(value = "/delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") String id) {
        deptService.removeById(id);
        return new ResponseEntity<>("deleted successfully", HttpStatus.OK);
    }

    @PostMapping(value = "/update")
    public ResponseEntity<Object> delete(@RequestBody Dept params) {
        deptService.updateById(params);
        return new ResponseEntity<>("updated successfully", HttpStatus.OK);
    }
}
