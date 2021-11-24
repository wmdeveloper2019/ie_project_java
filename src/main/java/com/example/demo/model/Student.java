package com.example.demo.model;

public class Student {
    private String name;
    private String family;
    private String codemelli;
    private String sn;

    public Student(String name, String family, String codemelli, String sn) {
        this.name = name;
        this.family = family;
        this.codemelli = codemelli;
        this.sn = sn;
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

    public String getCodemelli() {
        return codemelli;
    }

    public void setCodemelli(String codemelli) {
        this.codemelli = codemelli;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getRegisterQuery() {
        return "INSERT INTO student(name, family, studentid, codemelli) VALUES ('" + name + "','"+ family + "','"+ sn + "','" + codemelli +"');";
    }
}
