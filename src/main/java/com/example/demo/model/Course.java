package com.example.demo.model;

public class Course {

    private String lesson_id;
    private String lesson_name;
    private String prof_id;
    private String prof_name;
    private String group_num;
    private int unit=0;
    private String day1;
    private String day2;
    private String time1;
    private String time2;
    private String exam_date;
    private String exam_time;

    public Course(String lessonid,String profid,String group_num,String Day1,
                  String Day2,String Time1,String Time2,String examDate,String examTime)
    {
        this.lesson_id=lessonid;
        this.prof_id=profid;
        this.group_num=group_num;
        this.day1=Day1;
        this.day2=Day2;
        this.time1=Time1;
        this.time2=Time2;
        this.exam_date=examDate;
        this.exam_time=examTime;
    }

//**********************************get funcs
    public String getId() {
        return lesson_id;
    }
    public String getLessonName() {
        return lesson_name;
    }
    public String getprofName(){
        return prof_name;
    }
    public String getprofId(){
        return prof_id;
    }
    public String getGroup(){
        return group_num;
    }
    public int getUnit(){
        return unit;
    }
    public String getDay1(){
        return day1;
    }
    public String getDay2(){
        return day2;
    }
    public String getTime1(){
        return time1;
    }
    public String getTime2(){
        return time2;
    }
    public String getExamDate(){
        return exam_date;
    }
    public String getExamTime(){
        return exam_time;
    }
//**********************************setter funcs
    public void setUnit(int unitOfCourse){
        this.unit=unitOfCourse;
    }
    public void setLessonName(String name) {
        this.lesson_name = name;
    }
    public void setProfName(String name) {
        this.prof_name = name;
    }

//***********************************query


}
