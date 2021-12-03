package com.ncjt.rg405.bean;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String sname;
    private String snum;
    private String phone;
    private String school;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return sname;
    }

    public void setName(String name) {
        this.sname = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getNum() {
        return snum;
    }

    public void setNum(String num) {
        this.snum = num;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + sname + '\'' +
                ", num='" + snum + '\'' +
                ", phone='" + phone + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}
