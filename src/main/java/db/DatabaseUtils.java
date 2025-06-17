package db;

import java.sql.*;

public class DatabaseUtils {
    private static final String URL = "jdbc:mysql://localhost:3306/test";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static ResultSet executeQuery(String query) throws SQLException {
        return getConnection().createStatement().executeQuery(query);
    }
}