package lt.codeacademy.learn.authors.repositories;

import lt.codeacademy.learn.authors.entities.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long>{


}
