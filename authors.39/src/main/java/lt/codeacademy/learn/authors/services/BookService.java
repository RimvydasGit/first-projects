package lt.codeacademy.learn.authors.services;

import lt.codeacademy.learn.authors.entities.Book;
import lt.codeacademy.learn.authors.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRep;

    public Iterable<Book> findAll() {
        return  bookRep.findAll();
    }

    public void saveAll(List<Book> list) {

        bookRep.saveAll(list);
    }
}
