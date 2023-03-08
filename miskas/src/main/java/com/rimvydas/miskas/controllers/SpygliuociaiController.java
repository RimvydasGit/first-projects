package com.rimvydas.miskas.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/miskas/spygliuociai")
public class SpygliuociaiController {
    @GetMapping
    public String spygliuociai(){
        return "Labas, cia spygliuociu zona";
    }
    @GetMapping("/egle/{count}")
    public String egle(@PathVariable("count") int count){
        return "Cia auga egles, kiekis: " + count;

    }  @GetMapping({"/pusis/{count}","/pusis"})
    public String pusis(@PathVariable Optional<Integer> count){
       return !count.isEmpty() ? "Cia auga pusis, kiekis: " + count.get() : "Cia auga pusis";
    }
    @GetMapping({"/kadagys/{count}","/kadagys"})
    public String kadagys(@PathVariable(required = false) Integer count){
        return (count != null) ? "Cia auga kadagys, kiekis: " + count : "Cia auga kadagys";

    }
}
