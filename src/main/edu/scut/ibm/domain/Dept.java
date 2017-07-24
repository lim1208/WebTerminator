package edu.scut.ibm.domain;

/**
 * Created by limin on 2017/7/24.
 */
public class Dept {
    private Integer id;//部门ID号
    private String name;//部门名称
    private String remark;//部门详细信息

    public Dept(){
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
