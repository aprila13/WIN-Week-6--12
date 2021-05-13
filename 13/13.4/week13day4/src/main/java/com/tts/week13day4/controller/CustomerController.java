package com.tts.week13day4.controller;


import com.tts.week13day4.model.Customer;
import com.tts.week13day4.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController{
    @Autowired
    CustomerRepository customerRepository;
    @GetMapping("/all")
    public Iterable<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

}
