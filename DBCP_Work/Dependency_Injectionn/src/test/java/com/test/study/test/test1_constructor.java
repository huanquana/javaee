package com.test.study.test;

import com.test.study.dao1.dao1_student1;
import com.test.study.dao2.dao2_school1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1_constructor {
    //有参构造器实现依赖注入
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        dao1_student1 dao1 = (dao1_student1) ac.getBean("dao");
        dao2_school1 dao2 = (dao2_school1) ac.getBean("school");
        dao2.setAddress("南昌市红谷滩");
        dao2.setName("南昌交通学院");
        dao1.setId(1);
        dao1.setAge(18);
        dao1.setName("欢权");
        dao1.setSex("男");
        System.out.println(dao1.toString());
    }
}
