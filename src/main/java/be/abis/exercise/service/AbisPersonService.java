package be.abis.exercise.service;

import be.abis.exercise.model.Course;
import be.abis.exercise.model.Person;
import be.abis.exercise.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbisPersonService implements PersonService {
    @Autowired
    private PersonRepository pr;



    public List<Person> findAllPersons() {
        return pr.findAllPersons();
    }

    public Person findPersonById(int ind) {
        return pr.findPersonById(ind);
    }

    public List<Person> findPersonByName(String name) {
        return pr.findPersonByName(name);
    }

    public void addPerson(Person p){

    }
    public void updatePerson(Person p) {

    }
    public void deletePerson(int id) {

    }

}
