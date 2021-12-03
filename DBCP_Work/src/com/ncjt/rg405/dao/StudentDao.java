package com.ncjt.rg405.dao;

import com.ncjt.rg405.bean.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentDao {
    List<Student> selectAll(Student stu) throws SQLException;
    Student selectBynum(Student stu) throws SQLException;
    int save(Student stu) throws SQLException;
    int delete(Student stu) throws SQLException;
    int updateBynum(Student stu) throws SQLException;
}
