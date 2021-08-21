package com.hadi.bookserviceproject.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Value("${server.port}")
    private String port;
    @Value("${detail.name}")
    private String detailName;
    @Value("${detail.app}")
    private String detailApp;
    @Value("${detail.global}")
    private String detailGlobal;
    @Value("${detail.book}")
    private String detailBook;

    @GetMapping("/config")
    public String getConfig() {
        String s = "port: " + port + "\ndetail.name: " + detailName +
                "\ndetail.app: " + detailApp +"\ndetail.gloal: " + detailGlobal +
                "\ndetail.book: " + detailBook;
        return s;
    }
}
