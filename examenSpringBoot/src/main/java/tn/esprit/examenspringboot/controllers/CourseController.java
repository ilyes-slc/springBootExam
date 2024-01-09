package tn.esprit.examenspringboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examenspringboot.entities.Course;
import tn.esprit.examenspringboot.entities.Person;
import tn.esprit.examenspringboot.services.CourseService;
import tn.esprit.examenspringboot.services.ICourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    ICourseService courseService;

    @PostMapping("/add-course/{id}")
    public Course addCourse(@RequestBody Course c,@PathVariable("id") long personID) {
        return courseService.CourseaddCourseAssignCoach(c,personID);
    }

}
