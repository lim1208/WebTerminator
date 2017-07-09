package edu.scut.ibm.bean;

import java.util.Date;

/**
 * Created by limin on 2017/5/3.
 */
public class Spittle {
    private long id;
    private String message;
    private Date time;

    public Spittle(){

    }

    public Spittle(long id, String message, Date time){
        this.id = id;
        this.message = message;
        this.time = time;
    }

    public Spittle(String message, Date time){
        this.message = message;
        this.time = time;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
