package com.test.assembly_bean.school;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//将红School2对象添加进容器
@Component("school")
public class School2 {
    @Value("南昌交通学院")
    private String name;
    @Value("黄家湖畔")
    private String address;

    @Override
    public String toString() {
        return "School2{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
