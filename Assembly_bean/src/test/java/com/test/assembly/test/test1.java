package com.test.assembly.test;

import com.test.assembly_bean.dao.dao1_xml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {
    public static void main(String[] args) {
        ApplicationContext ac= new ClassPathXmlApplicationContext("application_xml.xml");
        dao1_xml dao = (dao1_xml)ac.getBean("dao");
        System.out.println(dao.toString());
    }
}
