package com.ncjt.rg34.Test;

import com.ncjt.rg34.SCourseDao.SCourseDao;
import com.ncjt.rg34.SCourseDao.SCourseDaoImpl.SCourseDaoImpl;
import com.ncjt.rg34.bean.Course;

import java.io.IOException;
import java.util.List;

public class test {
    private static Course cou = null;
    private static SCourseDao dao = null;
    public static void main(String[] args) throws IOException {
        dao = new SCourseDaoImpl();
        /*//查询所有
        List<Course> coulist = dao.select();
        for (Course cou : coulist){
            System.out.println(cou);
        }
        *///添加学生信息
        //cou = new Course(4,"Python",005,"张老师");
        /*cou = new Course();
        cou.setCourse("Python");
        cou.setCoursenum("005");
        cou.setId(4);
        cou.setTeacherName("张老师");
        int i =  dao.save(cou);
        if(i <= 0){
           System.out.println("插入失败!");
       }*///通过id删除
        /*cou = new Course();
        cou.setId(1);
        int i = dao.delete(cou);
        if(i<=0)
            System.out.println("删除失败!");
         */
        //通过id查找
        cou = new Course();
        cou.setId(1);
        List<Course> coulist = dao.selectByid(cou);
        System.out.println(coulist.toString());
    }
}
