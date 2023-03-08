package com.rimvydas.miskas.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/miskas/lapuociai")
public class LapuociaiController {
    @GetMapping
    public String spygliuociai(){
        return "Labas, cia spygliuociu zona";
    }
    @GetMapping("/berzas/{count}")
    public String berzas(@PathVariable("count") int count){
        return "Cia auga berzas, kiekis: " + count;

    }  @GetMapping("/uosis/{count}")
    public String puosis(@PathVariable("count") int count){
        return "Cia auga uosis, kiekis: " + count;
    }
    @GetMapping("/klevas/{count}")
    public String klevas(@PathVariable("count") int count){
        return "Cia auga klevas, kiekis: " + count;
    }
}
