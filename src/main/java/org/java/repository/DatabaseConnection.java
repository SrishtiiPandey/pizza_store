package org.java.repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/pizzaStore";
    private static final String USER = "postgres";
    private  static final  String PASSWORD = "Asdf123$";

    private static Connection getConnection() throws SQLException {
        return  DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
