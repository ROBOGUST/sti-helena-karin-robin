package sti.helena.karin.robin.domain;

public class Teacher extends Human {

    private String givenName;
    private String surName;
    private int personalId;

    int courseId;
    int teacherId;
    double salaryPerHour;

    public Teacher(String givenName, String surName, int personalId){
        this.givenName = givenName;
        this.surName = surName;
        this.personalId = personalId;
    }
}


