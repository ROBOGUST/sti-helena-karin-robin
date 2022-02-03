package sti.helena.karin.robin.service;

import sti.helena.karin.robin.domain.Course;
import sti.helena.karin.robin.domain.Student;

public interface StiService {
    Student getStudent(String pnr);
    Course getCourseId(int cid);
}
