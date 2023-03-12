package com.codeacademy.news.entities;

import javax.persistence.*;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    Long id;
    @Column(name="name")
    String name;
    @Column(name="text")
    String text;

    public Article() {
    }

    public Article(Long id, String name, String text) {
        this.id = id;
        this.name = name;
        this.text = text;
    }

    public Article(String name, String text) {
        this.name = name;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", text='" + text + '\'' +
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}