package com.ncjt.rg34.SCourseDao;

import com.ncjt.rg34.bean.Course;

import java.io.IOException;
import java.util.List;

public interface SCourseDao {
    public int save(Course cou) throws IOException;
    public int update(Course cou);
    public int delete(Course cou) throws IOException;
    public List<Course> selectByid(Course cou) throws IOException;
    public List<Course> select() throws IOException;
}
