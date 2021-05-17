package com.example.validatingforminput.controller;

import com.example.validatingforminput.model.PersonForm;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;

//This controller has a GET method and a POST method. Both methods are mapped to /.
@Controller
public class WebController implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }



    //The showForm method returns the form template.
    //It includes a PersonForm in its method signature so that the template can associate form attributes
    //with a PersonForm.
    @GetMapping("/")
    public String showForm(PersonForm personForm) {
        return "form";
    }


    //The checkPersonInfo method accepts two arguments:
        //A personForm object marked with @Valid to gather the attributes filled out in the form.
        //A bindingResult object so that you can test for and retrieve validation errors.
        //If you encounter an error, you can send the user back to the original form template. In that situation, all the error attributes are displayed.
        //If all of the person’s attribute are valid, it redirects the browser to the final results template.
    @PostMapping("/")
    public String checkPersonInfo(@Valid PersonForm personForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "form";
        }

        return "redirect:/results";
    }

}
