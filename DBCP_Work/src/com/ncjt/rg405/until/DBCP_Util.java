package com.ncjt.rg405.until;

import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DBCP_Util {
    private static DataSource ds;

    static{
            try {
                InputStream in = DBCP_Util.class.getClassLoader().getResourceAsStream("dbcpconfig.properties");
                Properties pro = new Properties();
                pro.load(in);
                ds = BasicDataSourceFactory.createDataSource(pro);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
    public void release(Connection con, ResultSet rs, PreparedStatement ps) throws SQLException {
        if(rs != null){
            rs.close();
        }
        rs = null;
        if(ps != null){
            ps.close();
        }
        ps = null;
        if(con != null){
            con.close();
        }
        con = null;
    }

}

