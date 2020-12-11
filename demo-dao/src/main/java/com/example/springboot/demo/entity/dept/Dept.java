package com.example.springboot.demo.entity.dept;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
/**
 * <p>
 * 
 * </p>
 *
 * @author yuanrp
 * @since 2020-12-11
 */
@TableName("dept")
public class Dept implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer DEPTNO;

    private String DNAME;

    private String LOC;

    private Integer FLAG;

    public Integer getDEPTNO() {
        return DEPTNO;
    }

    public void setDEPTNO(Integer DEPTNO) {
        this.DEPTNO = DEPTNO;
    }

    public String getDNAME() {
        return DNAME;
    }

    public void setDNAME(String DNAME) {
        this.DNAME = DNAME;
    }

    public String getLOC() {
        return LOC;
    }

    public void setLOC(String LOC) {
        this.LOC = LOC;
    }

    public Integer getFLAG() {
        return FLAG;
    }

    public void setFLAG(Integer FLAG) {
        this.FLAG = FLAG;
    }

    @Override
    public String toString() {
        return "Dept{" +
        ", DEPTNO=" + DEPTNO +
        ", DNAME=" + DNAME +
        ", LOC=" + LOC +
        ", FLAG=" + FLAG +
        "}";
    }
}
