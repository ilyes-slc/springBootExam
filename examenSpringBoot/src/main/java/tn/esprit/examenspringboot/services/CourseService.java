package tn.esprit.examenspringboot.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.examenspringboot.entities.Course;
import tn.esprit.examenspringboot.entities.Person;
import tn.esprit.examenspringboot.entities.enums.Role;
import tn.esprit.examenspringboot.repositories.CourseRepository;
import tn.esprit.examenspringboot.repositories.PersonRepository;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
@AllArgsConstructor
public class CourseService implements ICourseService{
    CourseRepository courseRepository;
    PersonRepository personRepository;

    @Override
    public Course CourseaddCourseAssignCoach(Course course, Long personID) {
        Person p = personRepository.findById(personID).orElse(null);

        assert p != null;
        if (p.getRole()== Role.COACH) {
            courseRepository.save(course);
            p.setCoursesAnime(Set.of(course));
            personRepository.save(p);
        }

        return course;
    }
}
