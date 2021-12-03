package com.ncjt.rg34.bean;

import java.io.Serializable;

public class Course implements Serializable {
    private int id;
    private String course;
    private String coursenum;
    private String teacherName;
    /*public Course(int id,String course,int coursenum,String teacherName){
        this.course = course;
        this.coursenum = coursenum;
        this.id = id;
        this.teacherName = teacherName;
    }
     */
    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoursenum() {
        return coursenum;
    }

    public void setCoursenum(String coursenum) {
        this.coursenum = coursenum;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", 课程:'" + course + '\'' +
                ", 课程编号:" + coursenum +
                ", 任教老师:'" + teacherName + '\'' +
                '}';
    }
}
