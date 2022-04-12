package com.otisps.demo.person;

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
    private Long id;
    private String givenName;
    private String familyName;

    public Person(String givenName, String familyName) {
        this.givenName = givenName;
        this.familyName = familyName;
    }

    public Person() {

    }

    public String getGivenName() {
        return givenName;
    }

    public String getFamilyName() {
        return familyName;
    }
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

}
