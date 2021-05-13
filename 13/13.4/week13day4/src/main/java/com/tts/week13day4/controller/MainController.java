package com.tts.week13day4.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Annotation to create routes - Allows restful endpoints
@RestController
public class MainController {

    //this is an endpoint
    @RequestMapping("/")
    public String home() {
        return "hello world";
    }

    //Going to the endpoint will resolve the method
    @GetMapping("/math")
    public Integer doMath() {
        return 5 + 4;
    }

    @RequestMapping("/print")
    public void doPrint() {
        System.out.println("Printing to the terminal");;
    }

    @GetMapping("/parammath/{x}/{y}")
    public Integer doMathWithParams(@PathVariable int x,
                                    @PathVariable int y){
        return x +y;
    }

    @GetMapping("/hello/{name}")
    public String homeWithName(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping("/math/sub/{x}/{y}")
    public Integer doSubtraction (@PathVariable int x,
                                  @PathVariable int y) {
        return x - y;
    }
}

//Run the main method and go to localhost8080
