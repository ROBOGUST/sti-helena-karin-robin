package sti.helena.karin.robin.domain;

public class Course {
    private String courseName;
    private int courseId;
    private int teacherId;
    private int courseHours;
    private int studdyPoints;

    public Course(String courseName, int courseId, int teacherId, int courseHours, int studdyPoints){
        this.courseName = courseName;
        this.courseId = courseId;
        this.teacherId = teacherId;
        this.courseHours = courseHours;
        this.studdyPoints = studdyPoints;
    }

    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getCourseHours() {
        return courseHours;
    }

    public void setCourseHours(int courseHours) {
        this.courseHours = courseHours;
    }

    public int getStuddyPoints() {
        return studdyPoints;
    }

    public void setStuddyPoints(int studdyPoints) {
        this.studdyPoints = studdyPoints;
    }
}
