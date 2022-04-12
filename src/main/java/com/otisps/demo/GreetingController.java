package com.otisps.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class GreetingController {

    @GetMapping("/greeting") // map to /greeting
    public String greeting(
            @RequestParam(name="name", required = false, defaultValue = "World") String name,
            // take name from the body of the request
            Model model){ // Model be the template
        model.addAttribute("name", name); // add name to our template
        return "greeting";
    }
}
