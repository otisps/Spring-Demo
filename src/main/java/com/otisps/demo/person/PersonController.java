package com.otisps.demo.person;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/person")
    public String HelloForm(Model model){
       model.addAttribute("person", new Person());
       return "person";
    }


    @PostMapping("/person")
    public String HelloSubmit(@ModelAttribute Person person, Model model){
        Person createdPerson = this.personService.createNewPerson(person);
        model.addAttribute("person", createdPerson);
        return "result";
    }

}
