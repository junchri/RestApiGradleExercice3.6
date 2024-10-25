package be.abis.exercise.controller;

import be.abis.exercise.model.Person;
import be.abis.exercise.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonApiController {
    @Autowired
    PersonService personService;

    @GetMapping("/persons")
    public Person findPersonById(@RequestParam("id") int id) {
        return personService.findPersonById(id);
    }

    @GetMapping("/personname")
    public List<Person> findPersonByName(@RequestParam("name") String name) {
        return personService.findPersonByName(name);
    }
}
