package com.example.springboot.demo.test.vo;

import com.example.springboot.demo.base.vo.BaseVO;
import lombok.Data;

@Data
public class DeptVO extends BaseVO {
    private static final long serialVersionUID = -4560938635779292499L;

    private int deptNo;

    private String dName;

    private String loc;

    private int flag;

}
