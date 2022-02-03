package sti.helena.karin.robin.service.impl;
import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sti.helena.karin.robin.domain.Course;
import sti.helena.karin.robin.domain.Student;
import sti.helena.karin.robin.domain.Vault;
import sti.helena.karin.robin.service.Logg;
import sti.helena.karin.robin.service.StiService;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;

public class Main {

    private static StiService service;

    private static ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:sti-helena-karin-robin-service.xml");

    public static void main(String[] args) {

       /* ArrayList<Student> student = new ArrayList<>();

        student.add(Vault.student1);
        student.add(Vault.student2);
        student.add(Vault.student3);

        for(Student x : student){
            System.out.println(x);
        }*/

       // System.out.println("Ange personnummer för eleven");
       // Scanner input = new Scanner(System.in);

        service = (StiService) applicationContext.getBean("service");

        Student student =service.getStudent("197304124433");
        Course course = service.getCourseId(1);

        System.out.println(student.getGivenName() + " " + student.getSurName() + " " + course.getCourseId());

        /*try{
            Logg mylogg = new Logg("logg.txt");
            mylogg.logger.setLevel(Level.ALL);
        } catch (IOException e) {
        }*/
    }
}
