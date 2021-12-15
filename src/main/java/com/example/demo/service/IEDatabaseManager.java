package com.example.demo.service;

import com.example.demo.model.Instructor;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@Service
@Lazy
public class IEDatabaseManager {

    String url = "jdbc:mysql://localhost:3306/classie";
    String user = "";
    String pass = "";


    @Autowired
    public IEDatabaseManager(@Value("${database-username:root}") String user,
                             @Value("${database-password:}") String pass){
        this.pass = pass;
        this.user = user;
        System.out.println("database username "+user+"    database password "+pass);
    }
    public String  registerInstructor (Instructor newinstructor){
        try (Connection conn = DriverManager.getConnection(url, user, pass);
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
         try (Connection conn = DriverManager.getConnection(url,user,pass);
             Statement stmt = conn.createStatement();
        ) {
            stmt.executeUpdate(newstudent.getRegisterQuery());
        } catch (SQLException e) {
            e.printStackTrace();
            return "There is an internal error :( call administrator.";
        }
        return "The student inserted successfully!!!";
    }

    public String choseCourse(Student newstudent) {
        try (Connection conn = DriverManager.getConnection(url,user,pass);
             Statement stmt = conn.createStatement();
        ) {
            stmt.executeUpdate(newstudent.getRegisterQuery());
        } catch (SQLException e) {
            e.printStackTrace();
            return "There is an internal error :( call administrator.";
        }
        return "The student inserted successfully!!!";
    }

    public String seeCourse() {
        try (Connection conn = DriverManager.getConnection(url,user,pass);
             Statement stmt = conn.createStatement();
        ) {
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return "There is an internal error :( call administrator.";
        }
        return "The student inserted successfully!!!";
    }
}

