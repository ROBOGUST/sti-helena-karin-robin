package sti.helena.karin.robin.domain;

import java.util.ArrayList;
import java.util.List;

public class Vault {

    public static List<Student> students = new ArrayList<>();
    public static List<Course> courses = new ArrayList<>();

    static Student student1= new Student("Adam", "Svensson", "197304124433", "Java A");
    static Student student2= new Student("Klara", "Olsson", "199203273445", "Databas");
    static Student student3= new Student("Sven", "Svensson", "197302324556", "Java B");

    static Course kurs1= new Course("Java A", 1, 1, 160, 20);
    static Course kurs2= new Course("Databas", 2, 2, 200, 25);
    static Course kurs3= new Course("Java B", 3, 1, 200, 25);

    Teacher teacher1 = new Teacher("Gurran", "Karlsson", 195604302354L);
    Teacher teacher2 = new Teacher("Gittan", "Gittanson", 197303126543L);


    public Vault(){
        addAllStudents();
        addAllCourses();
    }

    private static void addAllCourses() {
        courses.add(kurs1);
        courses.add(kurs2);
        courses.add(kurs3);
    }

    private static void addAllStudents(){
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public static String getCourseId(int courseId){
        for (Course c: courses){
            int id = c.getCourseId();
            if (id == 1){
                return "Java A";
            }
            if (id == 2){
                return "Databas";
            }
            if (id == 3){
                return "Java B";
            }
        }
        return null;
    }

    public Student getStudent(String pnr){
        for(Student s: students ){
            String personalId = s.getPersonalId();
            if(personalId.equals(pnr)){
               return s;
            }
        }
        return null;
    }

    public static Student removeStudent(String pNr){
        students.removeIf(s -> s.getPersonalId().equals(pNr));

        return null;
    }

}
