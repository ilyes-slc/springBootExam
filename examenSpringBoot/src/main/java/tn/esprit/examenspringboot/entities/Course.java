package tn.esprit.examenspringboot.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.examenspringboot.entities.enums.Level;

import java.time.LocalDate;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long courseID;
    private int num;
    private LocalDate date;
    private int duration;
    @Enumerated(EnumType.STRING)
    private Level level;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Exercise> Exercises;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Person> persons;

}
