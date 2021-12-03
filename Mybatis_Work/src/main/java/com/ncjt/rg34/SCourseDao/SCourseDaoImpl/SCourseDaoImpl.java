package com.ncjt.rg34.SCourseDao.SCourseDaoImpl;

import com.ncjt.rg34.SCourseDao.SCourseDao;
import com.ncjt.rg34.Utils.Mybatis_Util;
import com.ncjt.rg34.bean.Course;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class SCourseDaoImpl implements SCourseDao {
    private static SqlSession ss = null;

    @Override
    public int save(Course cou) throws IOException {
        ss = Mybatis_Util.getSqlSession();
        int i = ss.insert("save",cou);
        Mybatis_Util.close(ss);
        return i;
    }

    @Override
    public int update(Course cou) {
        return 1;
    }

    @Override
    public int delete(Course cou) throws IOException {
        ss = Mybatis_Util.getSqlSession();
        int i = ss.delete("delete",cou);
        Mybatis_Util.close(ss);
        return i;
    }

    @Override
    public List<Course> selectByid(Course cou) throws IOException {
        ss = Mybatis_Util.getSqlSession();
        List<Course> coulist = ss.selectList("selectById",cou);
        Mybatis_Util.close(ss);
        return coulist;

    }

    @Override
    public List<Course> select() throws IOException {
            ss = Mybatis_Util.getSqlSession();
            Mybatis_Util.close(ss);
            return ss.selectList("selectAll");

    }
}