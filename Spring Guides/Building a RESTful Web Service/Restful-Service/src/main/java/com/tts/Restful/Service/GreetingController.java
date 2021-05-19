package com.tts.Restful.Service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;


//This controller handles the HTTP requests
//Handles GET requests for /greeting by returning a new instance of the Greeting class
//This code uses Spring @RestController annotation, which marks the class as a
// controller where every method returns a domain object instead of a view.
// It is shorthand for including both @Controller and @ResponseBody.
@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

//The @GetMapping annotation ensures that HTTP GET requests to /greeting are mapped to the greeting() method.
//@RequestParam binds the value of the query string parameter name into the name parameter of the greeting() method.
//If the name parameter is absent in the request, the defaultValue of World is used.
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World")
                             String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

}
//http://localhost:8080/greeting
//http://localhost:8080/greeting?name=April