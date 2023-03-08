package lt.codeacademy.learn.authors;

import lt.codeacademy.learn.authors.entities.Author;
import lt.codeacademy.learn.authors.entities.Book;
import lt.codeacademy.learn.authors.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import java.util.List;

@Configuration
public class Observer {
    @Autowired
    BookService bookService;

    @EventListener
    public void refreshedEventHandler(ContextStartedEvent ev) {
        seedBooks();
    }

    private void seedBooks() {
        Author a = new Author("Aleksandras", "Diuma");
        List<Book> list = List.of(
                new Book("Trys muskietininkai", "Apie draugyste  ir meile", a),
                new Book("Grafas Montekristas", "Apie  kersta ir meile", a),
                new Book("Karaliene margo", "Apie meile ir isdavyste", a)
        );
        bookService.saveAll(list);
    }

}
