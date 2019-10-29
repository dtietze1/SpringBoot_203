package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/songform")
    public String loadFormPage(Model mod1){
        mod1.addAttribute("song1", new Song());
        return "songform";
    }
    @PostMapping("/songform")
    public String loadFromPage(@ModelAttribute Song song1, Model mod1){
        mod1.addAttribute("song1", song1);
        return "confirmsong";
    }
}
