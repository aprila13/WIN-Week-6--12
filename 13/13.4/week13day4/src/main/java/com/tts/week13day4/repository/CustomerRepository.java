package com.tts.week13day4.repository;

import com.tts.week13day4.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
