package com.example.FCC.Project.dao;

import com.example.FCC.Project.model.Person;

import java.util.UUID;

public interface PersonDao {

    //Method to insert a person with a given ID
    int insertPerson(UUID id, Person person);


    //Method to insert a person w/o an ID.  ID is generated
    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }


}
