package sti.helena.karin.robin.test;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sti.helena.karin.robin.domain.Student;
import sti.helena.karin.robin.service.StiService;

import java.util.List;




public class TestStudent {
   static ApplicationContext applicationContext=
           new ClassPathXmlApplicationContext("classpath:sti-helena-karin-robin-service.xml");
    private static final String Adam ="Adam";

    @Test
    public void givenName(){
        StiService stiService = (StiService)applicationContext.getBean("service");
        Student student= stiService.getStudent("197304124433");
        Assert.assertEquals("Adam", student.getGivenName());
        //Assert.assertEquals("Adam", students.get(1));
    }


}
