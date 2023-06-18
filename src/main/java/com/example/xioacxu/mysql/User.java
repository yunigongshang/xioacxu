package com.example.xioacxu.mysql;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity//如果表名不是user，则注解更改为 @Entity(name="表名")
public class User {
    @Id
    private String name;
    private String scenic;

    public User(String name, String scenic, String time, String area) {
        this.name = name;
        this.scenic = scenic;
        this.time = time;
        this.area = area;
    }

    public User() {

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", scenic='" + scenic + '\'' +
                ", time='" + time + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
    //kkkkk

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScenic() {
        return scenic;
    }

    public void setScenic(String scenic) {
        this.scenic = scenic;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    private String  time;
    private String area;
}
