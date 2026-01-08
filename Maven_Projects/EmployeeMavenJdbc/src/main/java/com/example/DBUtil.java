package com.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

    public static Connection getConnection() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver"); // 🔥 REQUIRED

        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/skillnext_db",
            "root",
            "Snehith@123"
        );
    }
}
