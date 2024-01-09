package tn.esprit.examenspringboot.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.examenspringboot.entities.Person;
import tn.esprit.examenspringboot.repositories.PersonRepository;

@Slf4j
@Service
@AllArgsConstructor
public class PersonService implements  IPersonService{
    PersonRepository personRepository;

    @Override
    public Person addPerson(Person person) {
        return personRepository.save(person);
    }
}
