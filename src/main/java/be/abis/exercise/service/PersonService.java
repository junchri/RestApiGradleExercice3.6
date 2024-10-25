package be.abis.exercise.service;

import be.abis.exercise.model.Course;
import be.abis.exercise.model.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAllPersons();
    public Person findPersonById(int ind);
    public List<Person> findPersonByName(String name);
    void addPerson(Person p);
    void updatePerson(Person p);
    void deletePerson(int id);

}
