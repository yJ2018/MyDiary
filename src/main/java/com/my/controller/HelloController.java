package com.my.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value = "/hello")
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {

        return "hello world!";
    }

    @RequestMapping(value = "/world", method = RequestMethod.GET)
//    @PostMapping("/world")
//    @GetMapping("/world")
    public String world() {

        return " world!";
    }

    @RequestMapping("/test")
    public void ok() {

    }
}
