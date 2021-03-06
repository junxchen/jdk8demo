package com.sc.cd.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://127.0.0.1:3306/freelancer_v2?useUnicode=true&amp;characterEncoding=utf-8";
        String user = "root";
        String password = "root";
        //1.加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");
        //2.获得数据库链接
        Connection conn = DriverManager.getConnection(url, user, password);
        //3.通过数据库的连接操作数据库，实现增删改查（使用Statement类）
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from fl_enterprise");
        //4.处理数据库的返回结果(使用ResultSet类)
        while (rs.next()) {
            System.out.println(rs.getString("id") + " "
                    + rs.getString("name"));
        }

        //关闭资源
        rs.close();
        st.close();
        conn.close();
    }
}
