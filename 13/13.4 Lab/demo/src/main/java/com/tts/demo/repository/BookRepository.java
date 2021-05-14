package com.tts.demo.repository;

import com.tts.demo.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

//This method will be generated for us by Spring
//The generation will follow the name of the method
//In order to perform the requested functionality
public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}
