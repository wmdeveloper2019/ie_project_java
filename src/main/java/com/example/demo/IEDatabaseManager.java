package com.example.demo;

import com.example.demo.model.Instructor;
import com.example.demo.model.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class IEDatabaseManager {

    public String  registerInstructor (Instructor newinstructor){
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/classie", "root", "");
             Statement stmt = conn.createStatement();
        ) {
            stmt.executeUpdate(newinstructor.getReisterQuery());
        } catch (SQLException e) {
            e.printStackTrace();
            return "There is an internal error :( call administrator.";
        }
        return "The instructor inserted successfully!!!";
    }

    public String registerStudent(Student newstudent) {
         try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/classie", "root", "");
             Statement stmt = conn.createStatement();
        ) {
            stmt.executeUpdate(newstudent.getRegisterQuery());
        } catch (SQLException e) {
            e.printStackTrace();
            return "There is an internal error :( call administrator.";
        }
        return "The student inserted successfully!!!";
    }
}

