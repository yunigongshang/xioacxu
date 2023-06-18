package com.example.xioacxu.mysql;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="jianli")
public class jian {
    @Id
    private String name;
    private String school;
    private String college;

    private String bclass;

    private String number;
    private String resume;

    @Override
    public String toString() {
        return "jian{" +
                "name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", college='" + college + '\'' +
                ", bclass='" + bclass + '\'' +
                ", number='" + number + '\'' +
                ", resume='" + resume + '\'' +
                '}';
    }

    public jian(String name, String school, String college, String bclass, String number, String resume) {
        this.name = name;
        this.school = school;
        this.college = college;
        this.bclass = bclass;
        this.number = number;
        this.resume = resume;
    }

    public jian() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getBclass() {
        return bclass;
    }

    public void setBclass(String bclass) {
        this.bclass = bclass;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }
}
