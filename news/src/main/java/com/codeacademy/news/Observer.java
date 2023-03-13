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
                new Article("Parisian streets littered with trash after wave of strikes", "Massive strikes in Paris against pension reform this week are affecting trash pickup services in the French capital, with piles of waste sitting on many of the city’s normally picturesque streets."),
                new Article("Fox hunting club that first met in the 1700s holds last meet after new law",
                        "One of Scotland's oldest fox hunts has come to an end after 252 years following the introduction of new law on hunting."),
                new Article("After a tragic shipwreck, no peace for the dead or living",
                        "Two weeks after a boat packed with migrants sank off the coast of southern Italy, there is still no peace for the living or the dead."),
                new Article("What to know about hypersonic missiles fired by Russia at Ukraine",
                        "A Russian bomber fired three hypersonic missiles at the southern Ukrainian port city of Odesa on Monday night."),
                new Article("Georgia protests over foreign agents bill continue into second day",
                        "Tens of thousands of people gathered outside the Georgian parliament on Wednesday in the second day of protests in capital city Tbilisi.")
        );
        articleRepository.saveAll(articles);
    }

}
