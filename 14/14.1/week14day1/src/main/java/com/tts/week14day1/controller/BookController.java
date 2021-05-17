package com.tts.week14day1.controller;

import com.tts.week14day1.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BookController {

    @GetMapping("/books")
    public String getBooks(Model model) {
    List<Book> bookList = List.of(
            new Book(1L, "title 1", "author 1"),
            new Book(2L, "title 2", "author 2")
    );
        model.addAttribute("books", bookList);
        return "greeting";
    }

    //Resolves the link from greeting.html
    @GetMapping("/endpoint")
    @ResponseBody
    public String myEndPoint() {
        return "this is my endpoint";
    }
}
