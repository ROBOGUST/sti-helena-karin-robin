package sti.helena.karin.robin.test;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sti.helena.karin.robin.domain.Student;
import sti.helena.karin.robin.service.StiService;

import java.util.List;


public class TestStudent {
    ApplicationContext applicationContext= new ClassPathXmlApplicationContext("classpath:sti-helena-karin-robin-service.xml");
    private static final String Adam ="Adam";
    @Test
    public void givenName(){
        StiService stiService = (StiService)applicationContext.getBean("service");
        List<String> students = stiService.getStudent();
        Assert.assertEquals("Adam", students.get(1));
    }


}
   /* @Test
    public void testSpringWiring(){
        ScratchService scratchService = (ScratchService)applicationContext.getBean("service");
        List<String> students = scratchService.getStudents();
        Assert.assertEquals(MAX, students.get(1));
    }*/

/*
import org.springframework.context.support.ClassPathXmlApplicationContext;

        import sti.hknn.domain.Student;
        import sti.hknn.service.StiService;

        import static sti.hknn.domain.Vault.courseList;

public class TestService {
    ApplicationContext applicationContext= new ClassPathXmlApplicationContext("classpath:sti-hknn-service.xml");
    private StiService stiService;
    @Test
    public void studentConstructorTest() {
        Student student = new Student("firstName", "lastName", "personalId", courseList, "computer");
        Assert.assertEquals("firstName", student.getFirstName());
    }

    @Before
    public void Before(){
        stiService = (StiService) applicationContext.getBean("stiService");
    }
    @Test
    public void getStudentTest(){
        stiService.addStudent("firstName", "lastName", "personalId", courseList, "computer");
        Student student = stiService.getStudent("personalId");
        Assert.assertNotNull(student);
    }
}*/