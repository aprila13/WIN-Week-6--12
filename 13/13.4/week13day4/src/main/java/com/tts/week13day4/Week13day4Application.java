package com.tts.week13day4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class Week13day4Application {

	public static void main(String[] args) {
		SpringApplication.run(Week13day4Application.class, args);
	}

	@Bean
	WebMvcConfigurer webMvcConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addResourceHandlers(ResourceHandlerRegistry handlerRegistry) {
				handlerRegistry.addResourceHandler("/static/**")
						.addResourceLocations("classpath/static/");
			}
		};
	}

}
