package sti.helena.karin.robin.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vault {

    private static List<Student> students = new ArrayList<>();

    static Student student1= new Student("Adam", "Svensson", 197304124433L);
    static Student student2= new Student("Klara", "Olsson", 199203273445L);
    static Student student3= new Student("Sven", "Svensson", 197302324556L);

    Course kurs1= new Course("Java A", 1, 1, 160, 20);
    Course kurs2= new Course("Databas", 2, 2, 200, 25);
    Course kurs3= new Course("Java B", 3, 1, 200, 25);

    Teacher teacher1 = new Teacher("Gurran", "Karlsson", 195604302354L);
    Teacher teacher2 = new Teacher("Gittan", "Gittanson", 197303126543L);


    public Vault(){
        addAllStudents();
    }

    private static void addAllStudents(){
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }



    public Student getStudent(String pnr){
        for(Student s: students ){
            long personalId = s.getPersonalId();
            String idString = personalId+"";
            idString = idString.substring(0,12);
            if(idString.equals(pnr)){
               return s;
            }
        }
        return null;
    }






}
