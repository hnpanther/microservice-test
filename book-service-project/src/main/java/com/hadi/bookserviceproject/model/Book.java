package com.hadi.bookserviceproject.model;

public class Book {

    private int id;
    private String name;
    private int numberOfPage;
    private Author author;

    public Book() {}

    public Book(int id, String name, int numberOfPage, Author author) {
        this.id = id;
        this.name = name;
        this.numberOfPage = numberOfPage;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberOfPage=" + numberOfPage +
                ", author=" + author +
                '}';
    }
}
