package com.example.demo.Controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewEnpoint {
    @GetMapping("/newapi")
    public String index2() {
        return "Hii";
    }
}
