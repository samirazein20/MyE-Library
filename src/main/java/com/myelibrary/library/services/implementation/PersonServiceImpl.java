package com.myelibrary.library.services.implementation;

import com.myelibrary.library.model.Person;
import com.myelibrary.library.repository.PersonRepository;
import com.myelibrary.library.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;

    @Override
    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public List<Person> findAllById(Iterable<Long> personId) {
        return personRepository.findAllById(personId);
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public void deleteInBatch(Iterable<Long> personId) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Person getOnePerson(Long personId) {
        return personRepository.getOne(personId);
    }
}
