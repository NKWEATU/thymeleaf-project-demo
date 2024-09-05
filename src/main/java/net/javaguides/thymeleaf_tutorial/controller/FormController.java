package net.javaguides.thymeleaf_tutorial.controller;

import net.javaguides.thymeleaf_tutorial.model.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class FormController {
    // http://localhost:8080/register
    //handler method to handle user registration [page request
    @GetMapping("register")
    public String userRegistrationPage(Model model){

        //empty UserForm model to store form data
        UserForm userForm = new UserForm();
        model.addAttribute("userForm", userForm);

        List<String> listProfession = Arrays.asList("Web Developer","Engineer", "Teacher");
        model.addAttribute("listProfession", listProfession);
        return "register-form";
    }

    // handler method to handle user registration form submission request
    @PostMapping("register/save")
    public String submitForm(Model model,
                             @ModelAttribute("userForm") UserForm userForm){
        model.addAttribute("userForm", userForm);
        return "register-success";
    }
}
