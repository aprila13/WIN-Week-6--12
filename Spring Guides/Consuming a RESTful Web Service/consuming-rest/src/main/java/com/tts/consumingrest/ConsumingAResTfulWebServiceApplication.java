package com.tts.consumingrest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//You will build an application that uses Spring’s RestTemplate to retrieve a random Spring Boot quotation
//at https://quoters.apps.pcfone.io/api/random.

@SpringBootApplication
public class ConsumingAResTfulWebServiceApplication {

	private static final Logger log = LoggerFactory.getLogger(ConsumingAResTfulWebServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConsumingAResTfulWebServiceApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Quote quote = restTemplate.getForObject(
					"https://quoters.apps.pcfone.io/api/random", Quote.class);
			log.info(quote.toString());
		};
	}
}


//Run app in terminal
//./mvnw spring-boot:run