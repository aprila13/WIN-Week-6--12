package com.tts.simplewebproject.controller;

import com.tts.simplewebproject.model.Sneaker;
import com.tts.simplewebproject.repository.SneakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


//This class will make an instance of the Sneaker class to an endpoint
//@RestController for HTTP request + responses
//@Controller for using thymeleaf, templates

@RestController
public class SneakerController {

    //Binds the repo to the controller
    //Dependence injection
    //Needed
    //You always have to make an instance of the repository your using
    @Autowired
    SneakerRepository sneakerRepository;


    @GetMapping("/")
    public String returnHelloWorld() {
        return "Hello World!";
    }

    //returning a new instance of sneaker
    //The return type is Sneaker which is an object
    //Returns as an JSON object in the browser
    @GetMapping("/sneaker")
    public Sneaker returnNewSneaker() {
        return new Sneaker(2L, "blue");
    }

    @GetMapping("/all")
    public Iterable<Sneaker> getAllSneakers() {
        return sneakerRepository.findAll();
    }

    //Posting to endpoint
    //Adding a new sneaker to the repo
    @PostMapping("/add")
    public Sneaker addSneaker(Sneaker sneaker) {
        return sneakerRepository.save(sneaker);
    }
}

//@Controller/@GetMapping/@ResponseBody
//@RestController/@GetMapping