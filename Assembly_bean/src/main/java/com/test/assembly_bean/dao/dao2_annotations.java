package com.test.assembly_bean.dao;


import com.test.assembly_bean.school.School2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//将dao2_annotations对象添加进容器
@Component("dao")
public class dao2_annotations {
    //通过Value标签给变量赋值
    @Value("欢权")
    private String name;
    @Value("12")
    private int id;
    @Value("234743")
    private String sno;
    //加上@Qualifier("")则是通过类型名字匹配
    @Qualifier("school")
    //自动装配类型相同的bean
    @Autowired
    private School2 school;

    @Override
    public String toString() {
        return "dao2_annotations{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", sno='" + sno + '\'' +
                ", school=" + school.toString() +
                '}';
    }
}
