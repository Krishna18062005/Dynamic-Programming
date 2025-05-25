// Exercise 31: Basic JDBC Connection
// This program connects to a MySQL database, retrieves data from a 'students' table, and prints the results.

import java.sql.*;

public class JDBCConnectionExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database";
        String user = "your_username";
        String password = "your_password";
        
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM students";
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(query)) {
                while(rs.next()){
                    System.out.println("Student ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}