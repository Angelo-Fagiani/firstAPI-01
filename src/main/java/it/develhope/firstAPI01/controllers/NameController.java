package it.develhope.firstAPI01.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class NameController {

    @GetMapping(value = "/name")
    public String getName(){
        return "Angelo Fagiani";
    }
    @PostMapping("/{name}")
    public StringBuilder setReversedName(@PathVariable String name){
        StringBuilder stringBuilder = new StringBuilder(name);
        return stringBuilder.reverse();

    }
}
