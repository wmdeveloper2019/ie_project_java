package com.example.demo.model;

public class courseRequest {
    private String lesson_id;
    private String group_num;

    public courseRequest(String lessonId,String groupNum){
        this.lesson_id=lessonId;
        this.group_num=groupNum;
    }

//****************************************getter funcs

    public String getGroup(){
        return group_num;
    }
    public String getId() {
        return lesson_id;
    }

//*******************************************query
    public String getQueryChoiseLesson(String studentId){
        return "INSERT INTO chooselesson(stu_id , lesson_id , group_num) " +
                "VALUES ('" + studentId + "'," + lesson_id + "," + group_num + ");";
    }
}
