package com.example.FCC.Project.service;

import com.example.FCC.Project.dao.PersonDao;
import com.example.FCC.Project.model.Person;

public class PersonService {

    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }
}
