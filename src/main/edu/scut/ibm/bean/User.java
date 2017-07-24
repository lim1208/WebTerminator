package edu.scut.ibm.bean;

/**
 * Created by limin on 2017/7/9.
 */
@Deprecated
public class User {
    private int id;
    private String username;
    private int age;
    private String address;

    public User(){}

    public User(String username, int age, String address){
        this.username = username;
        this.age = age;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
