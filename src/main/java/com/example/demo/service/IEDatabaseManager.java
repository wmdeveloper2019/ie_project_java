package com.example.demo.service;

import com.example.demo.model.Course;
import com.example.demo.model.courseRequest;
import com.example.demo.model.Instructor;
import com.example.demo.model.Student;
import com.sun.java.util.jar.pack.DriverResource;
import com.sun.org.apache.bcel.internal.util.ClassPath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.sql.*;


@Service
@Lazy
public class IEDatabaseManager {

    String url = "jdbc:mysql://localhost:3306/ie_amoozesh";//the name must be change
    String user = "";
    String pass = "";


    @Autowired
    public IEDatabaseManager(@Value("${database-username:root}") String user,
                             @Value("${database-password:}") String pass)
    {
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
            final String s = "There is an internal error :( call administrator.";
            return s;
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

    public ArrayList<Course> getCourse(){
        ArrayList<Course> courseTable = new ArrayList<Course>();
       // ClassPath.getClassPath("/com/example/demo/service/com.mysql.jdbc.Driver");
        try (//DriverResource("com.mysql.jdbc.Driver");//DriverManager.getDriver("");
             //Class.forName("com.mysql.jdbc.Driver");
             //java.sql.DriverManager.registerDriver ("com.mysql.jdbc.Driver");
             Connection conn =DriverManager.getConnection(url,"root","");
             Statement stmt = conn.createStatement();
        ) {
            String sql = "SELECT * FROM courses;";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                courseTable.add(new Course(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9)
                 ));

            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("There is an internal error :( call administrator.");
        }
        return courseTable;
    }
}

