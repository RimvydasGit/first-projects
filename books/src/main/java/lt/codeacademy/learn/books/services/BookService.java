package lt.codeacademy.learn.books.services;

import lt.codeacademy.learn.books.entities.Book;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    List<Book> list = List.of(
            new Book("This is my A", "John Smith"),
            new Book("This is my B", "John Smith"),
            new Book("This is my C", "John Smith")
    );
    ArrayList<Book> arrayList = new ArrayList<>(list);
    public Book getBookById(int id) {
        if (id < 0 || id >= arrayList.size())
            return new Book();
        return arrayList.get(id);
    }

    public Book saveBook(@RequestBody Book book) {
        arrayList.add(book);
        return book;
    }
}
