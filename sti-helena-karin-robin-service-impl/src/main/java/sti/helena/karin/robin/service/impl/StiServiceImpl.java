package sti.helena.karin.robin.service.impl;

import sti.helena.karin.robin.domain.Course;
import sti.helena.karin.robin.domain.Student;
import sti.helena.karin.robin.domain.Vault;
import sti.helena.karin.robin.service.StiService;

public class StiServiceImpl implements StiService {
   private static Vault vault = new Vault();

    @Override
    public Student getStudent(String pnr) {
        return vault.getStudent(pnr);
    }

    @Override
    public Course getCourseId(int cid) {
        return getCourseId(cid);
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
