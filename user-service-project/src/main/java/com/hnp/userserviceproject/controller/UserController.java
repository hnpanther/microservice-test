package com.hnp.userserviceproject.controller;

import com.hnp.userserviceproject.model.Author;
import com.hnp.userserviceproject.model.Book;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {


    @Value("${server.port}")
    private String port;
    @Value("${detail.name}")
    private String detailName;
    @Value("${detail.app}")
    private String detailApp;
    @Value("${detail.global}")
    private String detailGlobal;

    @GetMapping("/config")
    public String getConfig() {
        String s = "port: " + port + "\ndetail.name: " + detailName +
                "\ndetail.app: " + detailApp +"\ndetail.gloal: " + detailGlobal;
        return s;
    }

    @GetMapping("/books/author")
    public Book getBooksOfAuthor(@RequestBody(required = false) Author author) {
        System.out.println(author);

        Book book1 = new Book();
        book1.setId(1);
        book1.setName("book1");
        book1.setNumberOfPage(100);
        book1.setAuthor(author);

        Book book2 = new Book();
        book2.setId(1);
        book2.setName("book2");
        book2.setNumberOfPage(150);
        book2.setAuthor(author);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        return book1;
    }

    @GetMapping("/author")
    public Author getAuthor() {
        Author author = new Author();
        author.setId(1);
        author.setName("authorName");
        return author;
    }
}
