package com.shoaib.myretail.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @RequestMapping(value = "/")
    public String helloWord() {
        return "myRetail";
    }
}
