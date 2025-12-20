package com.harmonique.masters.master_service.controller;

import com.example.demo.util.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/master")
public class GenreMainController {
    @Autowired
    Main main;
    @GetMapping("test")
    public String test(){
        return main.util();
    }
}
