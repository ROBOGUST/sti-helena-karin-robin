package sti.helena.karin.robin.service.impl;

//import com.sun.org.slf4j.internal.Logger;
//import com.sun.org.slf4j.internal.LoggerFactory;
import sti.helena.karin.robin.domain.Course;
import sti.helena.karin.robin.domain.Student;
import sti.helena.karin.robin.domain.Vault;
import sti.helena.karin.robin.service.StiService;

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
   /* @Override
    public Student getStudent(String pnr) {
        return vault.getStudent(pnr);
    }*/

    @Override
    public Course getCourseId(int cid) {
        return getCourseId(cid);
    }

    @Override
    public Object getStudent() {
        return students;
    }

    //Dao dao;

    /*
    public StiServiceImpl(Dao dao){
        this.dao = dao; //dao kommer att va ett interface,
        //men en implementerande klass
        //kommer att skickas in tack vare spring
    }

    //ServiceImpl har ingen aning om DaoImpl!
     public Student getStudentById(String id){
        return dao.getStudentById(id);
    }
     */
}
