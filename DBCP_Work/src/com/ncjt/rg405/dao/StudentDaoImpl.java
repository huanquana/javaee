package com.ncjt.rg405.dao;

import com.ncjt.rg405.bean.Student;
import com.ncjt.rg405.until.DBCP_Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao{
    private static Connection con = null;
    private static ResultSet rs = null;
    private static PreparedStatement ps = null;
    @Override
    public List<Student> selectAll(Student stu) throws SQLException {
        List<Student> stulist = new ArrayList<>();
        con = DBCP_Util.getConnection();
        String sql = "select * from student";
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        if(rs.next()){
            stu.setId(rs.getInt("id"));
            stu.setName(rs.getString("sname"));
            stu.setPhone(rs.getString("phone"));
            stu.setSchool(rs.getString("school"));
            stu.setNum(rs.getString("snum"));
            stulist.add(stu);
        }
        return stulist;
    }

    @Override
    public Student selectBynum(Student stu) throws SQLException {
        con = DBCP_Util.getConnection();
        String sql = "select * from student where snum = ?";
        ps = con.prepareStatement(sql);
        ps.setString(1,stu.getNum());
        rs = ps.executeQuery();
        if(rs.next()){
            stu.setId(rs.getInt("id"));
            stu.setName(rs.getString("sname"));
            stu.setPhone(rs.getString("phone"));
            stu.setSchool(rs.getString("school"));
            stu.setNum(rs.getString("snum"));
            return stu;
        }
            return null;
    }

    @Override
    public int save(Student stu) throws SQLException {
        con = DBCP_Util.getConnection();
        String sql = "insert into student values(?,?,?,?,?)";
        ps = con.prepareStatement(sql);
        ps.setInt(1,stu.getId());
        ps.setString(2,stu.getNum());
        ps.setString(3,stu.getName());
        ps.setString(4,stu.getPhone());
        ps.setString(5,stu.getSchool());
        int i = ps.executeUpdate();
        return i;
    }

    @Override
    public int delete(Student stu) throws SQLException {
        con = DBCP_Util.getConnection();
        String sql = "delete from student where snum = ?";
        ps = con.prepareStatement(sql);
        ps.setString(1,stu.getNum());
        int i = ps.executeUpdate();
        return i;
    }

    @Override
    public int updateBynum(Student stu) throws SQLException {
        con = DBCP_Util.getConnection();
        String sql = "update student set id = ?,sname = ?,phone = ?,school = ? where snum = ?";
        ps = con.prepareStatement(sql);
        ps.setInt(1,stu.getId());
        ps.setString(5,stu.getNum());
        ps.setString(2,stu.getName());
        ps.setString(3,stu.getPhone());
        ps.setString(4,stu.getSchool());
        int i = ps.executeUpdate();
        return i;
    }
}
