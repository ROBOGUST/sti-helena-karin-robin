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
        Scanner input = new Scanner(System.in);

        service = (StiService) applicationContext.getBean("service");

        System.out.println("Ange personnummer för eleven");
        String pNr = input.nextLine();
        Student student =service.getStudent(pNr);

        System.out.println("Ange kursid (1-3) för eleven");
        int courseId = input.nextInt();
        Course course = service.getCourseId(courseId);

        System.out.println(student.getGivenName() + " " + student.getSurName() + " " + course.getCourseId());

        /*try{
            Logg mylogg = new Logg("logg.txt");
            mylogg.logger.setLevel(Level.ALL);
        } catch (IOException e) {
        }*/
    }
}
