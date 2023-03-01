package lt.codeacademy.thymeleaf.entities;

import javax.persistence.*;

@Entity
@Table(name="_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    //@NotBlank(message = "Name is mandatory")
    private String name;

    //   @NotBlank(message = "Email is mandatory")
    private String surename;
    private String phone;


    public User() {
    }

    public User(String name, String surename, String phone) {
        this.name = name;
        this.surename = surename;
        this.phone = phone;

    }
    public User(long id,String name, String surename, String phone) {
        this.name = name;
        this.surename = surename;
        this.id = id;
        this.phone = phone;

    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                '}';
    }
}
