package com.codeacademy.news.controllers;

import com.codeacademy.news.entities.Article;
import com.codeacademy.news.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/news")
public class HomeController {
    @Autowired
    ArticleService articleService;

    @GetMapping
    public String showArticleList(Model model, @RequestParam(defaultValue = "0") int sorted) {
        List<Article> articleList = (sorted == 0)? articleService.findAll() : articleService.getAllSortedArticles();

        model.addAttribute("articles", articleList);
        return "index";
    }
    @GetMapping("/view-article/{id}")
    public String showArticle(@PathVariable("id") long id, Model model) {
        Article article = articleService.findById(id);
        model.addAttribute("article", article);
        return "view-article";
    }

    @GetMapping("/add-article")
    public String getAddArticle(Model model) {
        model.addAttribute("article", articleService.getNewArticle());
        return "add-article";
    }

    @PostMapping("/add-article")
    public String submitArticle(Article article, Model model, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add-article";
        }
        articleService.saveArticle(article);
        return "redirect:/news";
    }

    @GetMapping("/edit-article/{id}")
    public String showEditForm(@PathVariable("id") long id, Model model) {
        Article article = articleService.findById(id);
        model.addAttribute("article", article);
        return "edit-article";
    }

    @PostMapping("/edit-article/{id}")
    public String editArticle(@PathVariable("id") long id, Model model, Article article, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            article.setId(id);
            return "edit-article";
        }
        articleService.saveArticle(article);
        return "redirect:/news";
    }

    @GetMapping("/delete-article/{id}")
    public String deleteArticle(@PathVariable("id") long id, Model model) {
        Article article = articleService.findById(id);
        articleService.delete(article);
        return "redirect:/news";
    }



}
