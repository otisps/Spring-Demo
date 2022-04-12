package com.otisps.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
/***
 * Where our logic relating to persons goes.
 */
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    /**
     *
     * @param uncreatedPerson to add to person table
     * @return Person returned from table matching what we added.
     */
    public Person createNewPerson(Person uncreatedPerson){
        Person createdPerson = this.personRepository.save(uncreatedPerson);
        return createdPerson;
    }

    /**
     *
     * @param id of person, you want to delete from database
     * @return person deleted from database.
     */
    public Person deletePerson(Integer id){
        Optional<Person> personToDeleteOptional = this.personRepository.findById(id);

        if(!personToDeleteOptional.isPresent()) return null;

        Person personToDelete = personToDeleteOptional.get();
        this.personRepository.delete(personToDelete);
        return personToDelete;
    }

    public Iterable<Person> getAllPersons(){
        return this.personRepository.findAll();
    }

    public Optional<Person> getPersonById(Integer id) {
        return this.personRepository.findById(id);
    }

}
