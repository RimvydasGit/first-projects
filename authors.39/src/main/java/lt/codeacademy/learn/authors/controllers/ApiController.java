package lt.codeacademy.learn.authors.controllers;

import lt.codeacademy.learn.authors.entities.Book;
import lt.codeacademy.learn.authors.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    BookService bookService;
    @GetMapping
    public String hello(){
        return "Hello";
    }
    @GetMapping("/books")
    public Iterable<Book> allBooks(){
        return bookService.findAll();
    }
}
