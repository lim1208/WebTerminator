package edu.scut.ibm.domain;

import java.util.Date;

/**
 * Created by limin on 2017/7/24.
 */
public class User {
    private Integer id;//用户ID号，唯一标识
    private String username;//用户名
    private String loginname;//用户登录名
    private String password;//用户密码
    private Integer status;//用户状态
    private Date createDate;//建档时间

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
