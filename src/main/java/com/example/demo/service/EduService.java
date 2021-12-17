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
public class EduService {
    IEDatabaseManager ie ;

    @Autowired
    public EduService(IEDatabaseManager ie){
        this.ie = ie;
    }

    public String get(String name, String family) {
        return  ie.registerInstructor(new Instructor(name,family));
    }

    public String registerService(String name, String family) {
        return  ie.registerInstructor(new Instructor(name,family));
    }

    public String registerSeviceStudent(String name, String family, String codemelli, String sn) {
        return  ie.registerStudent(new Student(name,family,codemelli,sn));
    }
}
