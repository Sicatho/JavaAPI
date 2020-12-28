package com.github.java.spring.usman.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DemoService {

    @Autowired
    PersonRepository personRepository;

    public Person getPersonBy(String name) {
        Optional<Person> person = personRepository.findById(name);
        return person.get();
    }

    public Person getPersonByProfession(String profession) {
        Person person = personRepository.findByProfession(profession);
        return person;
    }
}
