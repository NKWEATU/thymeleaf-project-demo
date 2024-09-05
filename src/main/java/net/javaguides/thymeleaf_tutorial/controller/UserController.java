package net.javaguides.thymeleaf_tutorial.controller;

import net.javaguides.thymeleaf_tutorial.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    //handler method to handle variable-expression request
@GetMapping("variable-expression")
    public String variableExpression(Model model){
        User user = new User("Kennedy", "nkweatu@gmail.com", "ADMIN", "Male");
        model.addAttribute("user", user);
        return "variable-expression";
  }

  //handler method to handle selection expression
    // http://localhost:8080/selection-expression
    @GetMapping("selection-expression")
    public String selectionExpression(Model model){
        User user = new User("Kennedy", "kenny@gmail.com", "ADMIN", "Male");
        model.addAttribute("user", user);
        return "selection-expression";
    }

    //handler method to handle message expression request
    // http://localhost:8080/message-expression
    @GetMapping("message-expression")
    public String messageExpression(){
    return "message-expression";
    }

    //handler method to handle link expressions
    // http://localhost:8080/link-expression
    @GetMapping("link-expression")
    public String linkExpression(Model model){
    model.addAttribute("id", 1);
    return "link-expression";
    }

    //handler method to handle fragment expression
    // http://localhost:8080/fragment-expression
    @GetMapping("fragment-expression")
    public String fragmentExpression(){
    return"fragment-expression";
    }

    // http://localhost:8080/user
    @GetMapping("/user")
    public String users(Model model){
        User admin = new User("Admin", "nkweatu@gmail.com", "ADMIN", "Male");
        User kennedy = new User("kennedy", "esther@gmail.com", "USER", "Male");
        User jacinta = new User("Jacinta", "jessy1@gmail.com", "USER", "Female");
        List<User> users = new ArrayList<>();
        users.add(admin);
        users.add(kennedy);
        users.add(jacinta);
        model.addAttribute("users", users);
        return "users";
    }

    //handler method to handle if-unless concept
    // http://localhost:8080/if-unless
    @GetMapping("/if-unless")
    public String ifUnless(Model model){

        User admin = new User("Admin", "nkweatu@gmail.com", "ADMIN", "Male");
        User kennedy = new User("kennedy", "esther@gmail.com", "USER", "Male");
        User jacinta = new User("Jacinta", "jessy1@gmail.com", "USER", "Female");
        List<User> users = new ArrayList<>();
        users.add(admin);
        users.add(kennedy);
        users.add(jacinta);
        model.addAttribute("users", users);
        return "if-unless";
    }

    //handler method to handle switchCase concept
    // http://localhost:8080/switch-cases
    @GetMapping("switch-cases")
    public String switchCase(Model model){
        User user = new User (
                "kennedy",
                "kenney@gmai.com",
                "guest" ,
                "Male"
        );
        model.addAttribute("user", user);
        return "switch-cases";

    }
}
