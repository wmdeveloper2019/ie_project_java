package com.example.demo.model;

public class Instructor {


    private String name;
    private String family;

    public Instructor(String name, String family) {
        this.name = name;
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getReisterQuery() {
        return "INSERT INTO instructor(name, family) VALUES ('" + name + "','" + family +"');";
    }
}
