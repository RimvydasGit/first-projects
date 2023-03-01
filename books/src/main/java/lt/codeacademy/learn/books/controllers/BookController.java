package lt.codeacademy.learn.books.controllers;

import lt.codeacademy.learn.books.entities.Book;
import lt.codeacademy.learn.books.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class BookController {
    @Autowired
    BookService bookService ; //IoC
    @GetMapping("/index")//localhost:8082/index
    public String indexGet() {
        return "Labas, as esu Get endpoint";
    }


    @GetMapping("/book/{id}")//localhost:8082/book
    public Book book(@PathVariable int id) {
       return bookService.getBookById(id);
    }
    @PostMapping("/save")
    public Book bookSave(@RequestBody Book book){
        return bookService.saveBook(book);
    }
}
