package tn.esprit.examenspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examenspringboot.entities.Course;
import tn.esprit.examenspringboot.entities.Person;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
