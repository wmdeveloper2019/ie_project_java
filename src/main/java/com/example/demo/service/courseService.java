package com.example.demo.service;

import com.example.demo.model.Instructor;
import com.example.demo.model.Student;
import com.example.demo.model.Course;
import com.example.demo.model.courseRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
@Service
@Lazy
public class courseService {

    IEDatabaseManager ie ;

    @Autowired
    public courseService(IEDatabaseManager ie){
        this.ie = ie;
    }


    public ArrayList<Course> getCourses() {

        return  ie.getCourse();
    }



}
