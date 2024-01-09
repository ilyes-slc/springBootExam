package tn.esprit.examenspringboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long exerciseID;
    private String title;
    private int nbrOfRepetitions;
    private int breakTime;
    private int duration;
}
