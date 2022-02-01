package sti.helena.karin.robin.domain;

public class Student extends Human{
    private String givenName;
    private String surName;
    private String personalId;

    int courseId;
    String courseName;

    public Student(String givenName, String surName, String personalId){
        this.givenName=givenName;
        this.surName=surName;
        this.personalId= personalId;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }



}
