package tn.esprit.examenspringboot.services;

import tn.esprit.examenspringboot.entities.Course;

public interface ICourseService {
    public  Course CourseaddCourseAssignCoach(Course course,Long personID);
}
