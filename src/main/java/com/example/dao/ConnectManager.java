package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectManager {

    public static final String PASSWORD = "";
    public static final String USERNAME = "gitpod";
    public static final String JDBC_URL = "jdbc:postgresql://localhost/postgres";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }
    
}
