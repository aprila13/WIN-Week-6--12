package com.example.FCC.Project.api;

import com.example.FCC.Project.model.Person;
import com.example.FCC.Project.service.PersonService;

public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public void addPerson(Person person) {
        personService.addPerson(person);
    }
}
