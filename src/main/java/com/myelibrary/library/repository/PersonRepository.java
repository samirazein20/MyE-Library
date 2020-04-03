package com.myelibrary.library.repository;

import com.myelibrary.library.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
