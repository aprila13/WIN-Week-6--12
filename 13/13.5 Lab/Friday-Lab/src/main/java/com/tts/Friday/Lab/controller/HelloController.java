package com.tts.Friday.Lab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    public String sayHello() {
        return "I am saying hello";
    }

    //Default:  http://localhost:8080/contact
    //Query String/Param:  http://localhost:8080/contact?address=227St.
//    @GetMapping("/contact")
//    public String contact(@RequestParam(value="address",
//            required = false,
//            defaultValue = "123 Main St.") String address, Model model) {
//        model.addAttribute("address", address);
//        return "contact";
//    }

    @GetMapping("/contact")
    public String contact(@RequestParam(name="name",
            required = false,
            defaultValue="World") String name, Integer age, Model model) {
        model.addAttribute("address", "123 Main St.");
        model.addAttribute("name", name);
        model.addAttribute("age", 34);
        return "contact";
    }

    @GetMapping("/about")
    public String about(@RequestParam(name="name",
            required = false,
            defaultValue="April") String name, Model model) {
        model.addAttribute("profession", "DevOps Engineer");
        model.addAttribute("name", name);
        model.addAttribute("technologies", "Java & Spring Boot");
        return "about";
    }

}
