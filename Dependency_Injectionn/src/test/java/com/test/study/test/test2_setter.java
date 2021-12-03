package com.test.study.test;

import com.test.study.dao1.dao1_student2;
import com.test.study.dao2.dao2_school2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test2_setter {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("application2.xml");
        dao1_student2 dao = (dao1_student2) ac.getBean("dao");
        dao.setId(2);
        dao.setName("花花");
        dao.setAge(18);
        dao.setSex("女");

        dao2_school2 school = (dao2_school2) ac.getBean("school");
        school.setAddress("北京");
        school.setName("清华大学");
        System.out.println(dao.toString());
    }
}
