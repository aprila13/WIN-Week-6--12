package com.tts.week14day1.controller;

import com.tts.week14day1.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


//@Controller is an extension of @Component
//Spring will pick it up and utilize the component
//@Controller doesn't automatically have every methods return
//Acts as a response body -- this is only true for @RestController


@Controller
public class GreetingController {

    @GetMapping("/hello")
    @ResponseBody //tells Spring to use the return as a response body
    public String helloWorld() {
        return "Hello World";
    }

    // since this method is used to resolve a template
    // we do not say @ResponseBody
    //Model represents UI templates through thymeleaf
   //http://localhost:8080/greeting?name=April
    //http://localhost:8080/greeting
    //CSS can also be changed
    //This method doesn't need @ResponseBody since it serves an HTMl page
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name",
            required = false,
            defaultValue = "world") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/home")
    public String home(@RequestParam(name="name",
            required = false,
            defaultValue = "world") String name, Model model) {
        model.addAttribute("name", name);
        return "home";
    }

    @GetMapping("/greeting/var/{name}")
    @ResponseBody
    public String greetingWithPathVar(@PathVariable String name) {
        return "Hello there " + name;
    }
@PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "result";
}

}
