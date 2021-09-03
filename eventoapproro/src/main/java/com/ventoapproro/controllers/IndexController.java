package com.ventoapproro.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Define que a Classe será um Controller
public class IndexController {


    @RequestMapping("/")  // Define a url que quando seja requisitada chamará o método
    public String index(){

        return "index"; //retorna a view index.html
    }



}
