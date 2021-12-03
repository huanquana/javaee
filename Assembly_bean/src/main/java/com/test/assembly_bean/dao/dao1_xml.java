package com.test.assembly_bean.dao;

import com.test.assembly_bean.school.School1;

public class dao1_xml {
    private String name;
    private int id;
    private String sno;
    private School1 school;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    @Override
    public String toString() {
        return "dao1_xml{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", sno='" + sno + '\'' +
                ", school=" + school.toString() +
                '}';
    }

    public void setSchool(School1 school) {
        this.school = school;
    }
}
