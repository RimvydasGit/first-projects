package com.codeacademy.news.controllers;

import com.codeacademy.news.entities.Article;
import com.codeacademy.news.repositories.ArticleRepository;
import com.codeacademy.news.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    ArticleService articleService;

    @Autowired
    ArticleRepository articleRepository;

    @GetMapping("/articles")
    public List<Article> getAllArticle(){
        return articleService.getAllArticles();
    }
    @GetMapping("/article")
    public Article getArticle(){
        return articleRepository.findById(1l).get();
    }
}
