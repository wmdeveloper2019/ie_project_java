package com.example.demo.controller;

import com.example.demo.service.EduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EduConroller {

    EduService es;

    @Autowired
    public EduConroller(EduService es){
        this.es = es;
    }

    @GetMapping("/register")
    public String registerFunction(@RequestParam String name, @RequestParam String family) {
       return es.registerService(name,family);
    }

    @GetMapping("/registerstudent")
    public String registerFunction(@RequestParam String name, @RequestParam String family
            ,@RequestParam String codemelli, @RequestParam String sn) {
        return  es.registerSeviceStudent(name,family,codemelli,sn);
    }


}
