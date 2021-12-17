package com.example.demo.controller;

import com.example.demo.service.EduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Course;
import com.example.demo.model.courseRequest;
import java.util.ArrayList;
import com.example.demo.service.*;

@RestController
public class CourseController {
    courseService cs;
    @Autowired
    public CourseController (courseService cs){
        this.cs=cs;
    }
/*
    @GetMapping("/choiseCourses")
    public String registerFunction() {
       // return es.registerService(name,family);
    }
*/
    @GetMapping("/seeCourses")
    public String seeCourses() {
       StringBuilder str=new StringBuilder();
       ArrayList<Course> courseInfo=cs.getCourses();
       for(int i=0;i<courseInfo.size();i++){
           str.append("<p>");
           str.append(courseInfo.get(i).getId());
           str.append("</p>");
       }

       return str.toString();
    }
}
