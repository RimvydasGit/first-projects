package com.rimvydas.miskas.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/miskas")
public class MiskasController {
@GetMapping
  public  String miskas(){
    return "Labas. Jus esate miske";
}
}
