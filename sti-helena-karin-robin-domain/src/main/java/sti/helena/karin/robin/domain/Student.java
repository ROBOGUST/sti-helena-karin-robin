package sti.helena.karin.robin.domain;

public class Student extends Human{
    private String givenName;
    private String surName;
    private int personalId;


    int courseId;

    public Student(String givenName, String surName, int personalId, int courseId){
        this.givenName=givenName;
        this.surName=surName;
        this.personalId= personalId;
        this.courseId=courseId;
    }

}
