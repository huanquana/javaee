package com.ncjt.rg405.test;

import com.ncjt.rg405.bean.Student;
import com.ncjt.rg405.dao.StudentDao;
import com.ncjt.rg405.dao.StudentDaoImpl;

import java.sql.SQLException;
import java.util.List;
public class test {
    private static Student stu = null;
    private static StudentDao dao = null;
    public static void main(String[] args) throws SQLException {
        dao = new StudentDaoImpl();
        stu = new Student();
        /*通过学号查询
        stu.setNum("20190405");
        stu = dao.selectBynum(stu);
        System.out.println(stu.toString());
         */
        /*查询所有
        List<Student> stulist = dao.selectAll(stu);
        for(Student stu : stulist){
           System.out.println(stu.toString());
        }*/
        /*保存学生信息
        stu.setId(2);
        stu.setNum("20190431");
        stu.setName("郑俊杰");
        stu.setPhone("111012901039");
        stu.setSchool("清华大学");
        int i = dao.save(stu);
        if(i > 0){
            System.out.println("保存成功!");
        }*/
        /*修改学生信息
        stu.setId(3);
        stu.setName("徐威");
        stu.setPhone("34873473");
        stu.setSchool("北京大学");
        stu.setNum("20190431");
        int i = dao.updateBynum(stu);
        if(i > 0){
            System.out.println("修改成功!");
        }*/
        stu.setNum("20190431");
        int i = dao.delete(stu);
        if(i > 0){
            System.out.println("删除成功!");
        }
    }
}
