package com.tts.demo.repository;

import com.tts.demo.model.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//This method will be generated for us by Spring
//The generation will follow the name of the method
//In order to perform the requested functionality
@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}
