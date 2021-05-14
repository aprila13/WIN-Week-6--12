package com.example.FCC.Project.dao;

import com.example.FCC.Project.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class fakePersonDataAccessService implements PersonDao {

    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }
}
