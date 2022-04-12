package com.otisps.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PersonController {
    
    @GetMapping("/person")
    public String HelloForm(Model model){
       model.addAttribute("person", new Person());
       return "person";
    }


    @PostMapping("/person")
    public String HelloSubmit(@ModelAttribute Person person, Model model){
        model.addAttribute("person", person);
        return "result";
    }

}
