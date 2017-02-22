package com.example.android.reportcardapp;

/**
 * Created by 재은 on 2017-02-22.
 */

public class ReportCard {

    private String subject;
    private int count;
    private String name;
    private String grade;

    public ReportCard(String subject,int count,String name,String grade){
        this.subject = subject;
        this.count = count;
        this.name = name;
        this.grade = grade;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject=subject;
    }
    public int getCount(){
        return count;
    }
    public void setCount(int count){
        this.count=count;
    }
    public String getGrade(){
        return grade;
    }
    public void setGrade(String grade){
        if(count>90){
            grade ="A";
        }else if(count>80 && count<90){
            grade="B";
        }else{grade="C";}
        this.grade=grade;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "subject='" + subject + '\'' +
                ", count=" + count +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
