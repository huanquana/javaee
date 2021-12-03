package com.test.study.dao1;

import com.test.study.dao2.dao2_school1;

public class dao1_student1 {
    private int id;
    private String name;
    private int age;
    private String sex;
    private dao2_school1 school;

    public dao1_student1(dao2_school1 school){
        this.school = school;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    @Override
    public String toString() {
        return "dao1_student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", school=" + school.toString() +
                '}';
    }
}
