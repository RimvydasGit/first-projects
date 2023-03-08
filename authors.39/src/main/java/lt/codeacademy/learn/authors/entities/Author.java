package lt.codeacademy.learn.authors.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long author_Id;
    String firstName;
    String lastName;


    public Author(Long id, String firstName, String lastName) {
        this.author_Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Author() {
    }
    public Author( String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + author_Id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public Long getId() {
        return author_Id;
    }

    public void setId(Long id) {
        this.author_Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
