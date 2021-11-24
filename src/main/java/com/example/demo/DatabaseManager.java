package com.example.demo;


import java.sql.*;

public class DatabaseManager {

    public String insertIntoOpenVasResult(String name, String family,
                                          String sn, String code) {
        String sqlSelectAllPersons = "INSERT INTO students(Name, Family, StudentID, Codemelli) VALUES ('" +
                name + "','" + family + "','" + sn + "','" + code + "');";
        //String connectionUrl = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
             Statement stmt = conn.createStatement();
        ) {
            // Execute a query
            System.out.println("Inserting records into the table...");
            String sql = "INSERT INTO students(Name, Family, StudentID, Codemelli) VALUES (\'" +
                    name + "\',\'" + family + "\',\'" + sn + "\',\'" + code + "\');";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Stundet inserted";
    }

    public String search(String sn) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM students where StudentID=\"" + sn + "\";");
        ) {
            while (rs.next()) {
                //Display values
                System.out.print("Name: " + rs.getString("Name"));
                System.out.print(", Family: " + rs.getString("Family"));
                System.out.print(", Student ID: " + rs.getString("StudentID"));
                System.out.println(", Code Melli: " + rs.getString("Codemelli"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Search completed";
    }
}