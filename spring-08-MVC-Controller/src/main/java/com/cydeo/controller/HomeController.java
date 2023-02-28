package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //springboot is going to create a bin and manage it, adds a class in to a handler mapping
public class HomeController {


    @RequestMapping("/home")
    public String homePage1(){
        return "home.html";
    }


    @RequestMapping
    public String homePage2(){
        return "home.html";
    }

    @RequestMapping({"/apple","/orange", "/banana"})
    public String homePage3(){
        return "fruit.html";
    }


    @RequestMapping({"/payment","/pay","/bill"})
    public String paymentMethod(){

        return "payment.html";
    }



}
