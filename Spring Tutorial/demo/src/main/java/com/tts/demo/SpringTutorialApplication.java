package com.tts.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController  //that this code describes an endpoint that should be made available over the web.
public class SpringTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTutorialApplication.class, args);
	}

	//The @GetMapping(“/hello”) tells Spring to use our hello() method to answer
	//requests that get sent to the http://localhost:8080/hello address.
	//Finally, the @RequestParam is telling Spring to expect a name value in the request
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name",defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

//Resolves as default - Hello World
//http://localhost:8080/hello

//Resolves with parameter - Hello April
//http://localhost:8080/hello?name=April

	@GetMapping("/contact")
	public String contact(){
		return "Contact us at 1(800)-777-7777";
	}

	@GetMapping("/numbers")
		public int numbers() {
		return 10 + 5;
		}

}
