package com.myelibrary.library.services;

import com.myelibrary.library.model.Person;
import java.util.List;

public interface PersonService {
    Person savePerson(Person person);

    List<Person> findAllById(Iterable<Long> personId);

    List<Person> findAll();

    void deleteInBatch(Iterable<Long> personId);

    void deleteAllInBatch();

    Person getOnePerson(Long personId);
}
