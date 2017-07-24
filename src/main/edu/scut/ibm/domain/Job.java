package edu.scut.ibm.domain;

/**
 * Created by limin on 2017/7/24.
 */
public class Job {
    private Integer id;//职位ID号
    private String name;//职位名称
    private String remark;//职位详细描述

    public Job() {
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
