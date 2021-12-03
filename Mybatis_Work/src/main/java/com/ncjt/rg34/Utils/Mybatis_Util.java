package com.ncjt.rg34.Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.InputStream;

public class Mybatis_Util {
    private static InputStream in = null;
    private static SqlSessionFactory ssf = null;
    private static SqlSession ss = null;
    public static SqlSession getSqlSession() throws IOException {
        in = Resources.getResourceAsStream("mybatis-config.xml");
        ssf = new SqlSessionFactoryBuilder().build(in);
        ss = ssf.openSession();
        return ss;
    }
    public static void close(SqlSession ss){
        if(ss != null)
            ss.close();
        ss = null;
    }
}
