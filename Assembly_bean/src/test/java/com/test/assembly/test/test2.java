package com.test.assembly.test;

import com.test.assembly_bean.dao.dao2_annotations;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test2 {
    public static void main(String[] args) {
        ApplicationContext ac= new ClassPathXmlApplicationContext("application_annotation.xml");
        dao2_annotations dao = (dao2_annotations) ac.getBean("dao");
        System.out.println(dao.toString());
    }
}
