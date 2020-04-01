package com.myelibrary.library.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Librarian {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String fname;
}
