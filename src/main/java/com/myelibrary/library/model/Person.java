package com.myelibrary.library.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Person {
//alt+shift+command+U to create class diagram
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long personId;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    private String telephone;

    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addressId")
    private Address address;

    @OneToOne(mappedBy = "person")
    private Student student;

    @OneToOne(mappedBy = "person")
    private Author author;

    @OneToOne(mappedBy = "person")
    private Staff librarian;

    public Person() {
    }

    public Person(long personId,String firstName, String lastName, String telephone, Address address, Student student, Author author, Staff librarian) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;
        this.address = address;
        this.student = student;
        this.author = author;
        this.librarian = librarian;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Staff getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Staff librarian) {
        this.librarian = librarian;
    }
}
