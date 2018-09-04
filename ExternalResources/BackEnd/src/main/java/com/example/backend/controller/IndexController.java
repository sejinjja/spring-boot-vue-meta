package com.example.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {
    @Autowired
    ResourcePatternResolver resourcePatternResolver;

    @RequestMapping("/")
    public String index() {
        return "index.html";
    }
}
