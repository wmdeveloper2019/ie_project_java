package com.example.demo.controller;

import com.example.demo.IEDatabaseManager;
import com.example.demo.model.Instructor;
import com.example.demo.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EduConroller {

    @GetMapping("/register")
    public String registerFunction(@RequestParam String name, @RequestParam String family) {
        IEDatabaseManager ie = new IEDatabaseManager();
        return  ie.registerInstructor(new Instructor(name,family));
    }

    @GetMapping("/registerstudent")
    public String registerFunction(@RequestParam String name, @RequestParam String family
            ,@RequestParam String codemelli, @RequestParam String sn) {
        IEDatabaseManager ie = new IEDatabaseManager();
        return  ie.registerStudent(new Student(name,family,codemelli,sn));
    }


}
