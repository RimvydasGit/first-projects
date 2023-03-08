package lt.codeacademy.firma.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @ManyToOne
    //@Cascade(CascadeType.ALL)
    //@JoinColumn()
    Address address;

    public Department() {
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Department(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }


}
