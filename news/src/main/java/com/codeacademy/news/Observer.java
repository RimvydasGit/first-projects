package com.codeacademy.news;

import com.codeacademy.news.entities.Article;
import com.codeacademy.news.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

import java.util.List;

@Configuration
public class Observer {
    @Autowired
    ArticleRepository articleRepository;
    @EventListener
    public void refreshedEventHandler(ContextRefreshedEvent event) {
        if (articleRepository.findAll().isEmpty()) {
            seedArticlesDummyData();
        }
    }

    private void seedArticlesDummyData() {
        List<Article> articles = List.of(
                new Article("About trees", "There is five trees"),
                new Article("About beans", "There was colored beans"),
                new Article("About chuck", "There was kid chuck"),
                new Article("About tiger", "tiger was afraid of chuck presence"),
                new Article("About tiger in agony", "chuck's presence scared the tiger to death")
        );
        articleRepository.saveAll(articles);
    }

}
