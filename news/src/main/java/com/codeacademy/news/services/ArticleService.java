package com.codeacademy.news.services;

import com.codeacademy.news.entities.Article;
import com.codeacademy.news.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    ArticleRepository articleRepository;


    public List<Article> getAllArticles(){
        return articleRepository.findAll();
    }


    public Article getNewArticle() {
        Article article = new Article();
        return article;
    }

    public void saveArticle(Article article) {
        articleRepository.save(article);

    }

    public List<Article> findAll() {
        return articleRepository.findAll();
    }

    public Article findById(long id) {
        return articleRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
    }

    public void delete(Article article) {
        articleRepository.delete(article);

    }
    public List<Article> getAllSortedArticles(){
        return articleRepository.findAll(Sort.by(Sort.Direction.ASC, "name"));
    }

}