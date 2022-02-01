package sti.helena.karin.robin.domain;

public class Teacher extends Human {

    private String givenName;
    private String surName;
    private long personalId;

    int courseId;
    int teacherId;
    double salaryPerHour;

    public Teacher(String givenName, String surName, long personalId){
        this.givenName = givenName;
        this.surName = surName;
        this.personalId = personalId;
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

    public long getPersonalId() {
        return personalId;
    }

    public void setPersonalId(long personalId) {
        this.personalId = personalId;
    }
}


