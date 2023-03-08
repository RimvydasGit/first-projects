package lt.codeacademy.learn.authors.entities;


import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    String description;
    @ManyToOne
    @JoinColumn(name = "author_Id")
    Author author;

    public Book(){}

    public Book(String name,String description, Author author) {
        this.name = name;
        this.description = description;
        this.author = author;

    }

    public Book(Long id, String name, String description, Author author) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.author = author;
    }



    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", author=" + author +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}