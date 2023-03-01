package lt.codeacademy.learn.books.entities;

public class Book {
    //DTO
    String name;
    String author;
    public Book(){}

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }
    public  String getAuthor(){
        return author;
    }

}
