package net.javaguides.thymeleaf_tutorial.controller;


import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    //handler method to handle helloWorld request
    // http://localhost:8080/hello-world

    @GetMapping("/hello-world")
    public String helloWorld(Model model){
        model.addAttribute("message", "Hello World!");
        return "hello-world";
    }
}
