package com.example.springboot.demo.entity.test;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {

    private int deptNo;

    private String dName;

    private String loc;

    private int flag;
}
