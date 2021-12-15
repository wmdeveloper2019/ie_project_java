package com.example.demo.controller;

import com.example.demo.service.EduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @Autowired
    public CourseController (){

    }

    @GetMapping("/choiseCourses")
    public String registerFunction() {
       // return es.registerService(name,family);
    }

    @GetMapping("/seeCourses")
    public String registerFunction() {
       // return  es.registerSeviceStudent(name,family,codemelli,sn);
    }
}
