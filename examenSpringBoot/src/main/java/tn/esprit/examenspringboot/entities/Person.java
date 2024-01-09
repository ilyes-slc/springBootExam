package tn.esprit.examenspringboot.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.examenspringboot.entities.enums.Role;

import java.time.LocalDate;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long personID;
    private String  name;
    @Enumerated(EnumType.STRING)
    private Role role;
    private int nbrOfMonthsTraining;
    private LocalDate dateOfBirth;

    @ManyToMany(mappedBy="persons", cascade = CascadeType.ALL)
    private Set<Course> coursesParticipe;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Course> CoursesAnime;
}
