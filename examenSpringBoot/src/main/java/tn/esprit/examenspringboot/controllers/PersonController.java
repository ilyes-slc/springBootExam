package tn.esprit.examenspringboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.examenspringboot.entities.Person;
import tn.esprit.examenspringboot.services.IPersonService;

@RestController
@RequestMapping("/persons")
public class PersonController {
    @Autowired
    IPersonService personService;

    @PostMapping("/add-person")
    public Person addPerson(@RequestBody Person p) {
        return personService.addPerson(p);
    }
}
