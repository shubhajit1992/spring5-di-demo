package com.shubhajit.spring5didemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello() {
        return "Hello!!! - In MyController";
    }
}
