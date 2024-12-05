package ru.alishev.springcourse.models;

public class Book {
    private int id;
    private String title;
    private String author;
    private int release_date;

    public Book() {}

    public Book(int id, String title, String author, int release_date) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.release_date = release_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRelease_date() {
        return release_date;
    }

    public void setRelease_date(int release_date) {
        this.release_date = release_date;
    }
}
