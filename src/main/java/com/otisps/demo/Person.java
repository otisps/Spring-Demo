package com.otisps.demo;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @SequenceGenerator(
            name="person_sequence",
            sequenceName = "person_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "person_sequence"
    )
    Long id;
    String givenName;
    String lastName;

    public Person(String givenName, String lastName) {
        this.givenName = givenName;
        this.lastName = lastName;
    }

    public Person() {

    }

    public String getGivenName() {
        return givenName;
    }

    public String getLastName() {
        return lastName;
    }


}
