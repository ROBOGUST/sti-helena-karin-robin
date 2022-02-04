package sti.helena.karin.robin.service.impl;

//import com.sun.org.slf4j.internal.Logger;
//import com.sun.org.slf4j.internal.LoggerFactory;
import sti.helena.karin.robin.domain.Course;
import sti.helena.karin.robin.domain.Student;
import sti.helena.karin.robin.domain.Vault;
import sti.helena.karin.robin.service.StiService;

import static sti.helena.karin.robin.domain.Vault.courses;
import static sti.helena.karin.robin.domain.Vault.students;


public class StiServiceImpl implements StiService {
   private static Vault vault = new Vault();

    //private static final Logger LOGGER = LoggerFactory.getLogger(StiServiceImpl.class);

    @Override
    public Student getStudent(String personalId){
        for(Student student: students){
            if(student.getPersonalId().equalsIgnoreCase(personalId)){
                //LOGGER.trace("student found");
                return student;
            }
        }
        return null; //classes implementing this method will have to catch NullPointerException
    }

    @Override
    public Course getCourseId(int cid) {
        return getCourseId(cid);
    }


    @Override
    public Student removeStudent(String pNr) {
        Vault.removeStudent(pNr);

        return null;
    }


    @Override
    public Object getStudent() {
        return students;
    }

    @Override
    public Student alterCourse() {
        return null;
    }


}
