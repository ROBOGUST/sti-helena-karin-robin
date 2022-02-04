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

import static sti.helena.karin.robin.domain.Vault.students;

public class Main {

    private static StiService service;

    private static ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:sti-helena-karin-robin-service.xml");

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        service = (StiService) applicationContext.getBean("service");

        startMenu();
        int choice = input.nextInt();

        if (choice == 1){
            System.out.println("Ange personnummer för eleven");
            input.nextLine();
            String pNr = input.nextLine();
            Student student =service.getStudent(pNr);
            System.out.println(student.getGivenName() + " " + student.getSurName() + " " + student.getCourseName());
        }
        else if (choice == 2){
            System.out.println("Ange personnummer för eleven");
            input.nextLine();
            String pNr = input.nextLine();
            Student student = service.removeStudent(pNr);
            System.out.println(students);
        }
        else if (choice == 3){
            System.out.println("Ange kursid (1-3) för eleven");
            int courseId = input.nextInt();
            String course = Vault.getCourseId(courseId);
            System.out.println(course);
        }
        else if (choice == 4){
            System.out.println("Thank you and have a nice day!");
        }
        else{
            System.out.println("error");
        }

        /*try{
            Logg mylogg = new Logg("logg.txt");
            mylogg.logger.setLevel(Level.ALL);
        } catch (IOException e) {
        }*/
    }
    public static void startMenu(){
        System.out.println("Welcome to STI, please choose option:");
        System.out.println("1. Select student by personal ID.");
        System.out.println("2. Delete student by personal ID");
        System.out.println("3. Alter courses for student.");
        System.out.println("4. Quit program.");
    }
}
