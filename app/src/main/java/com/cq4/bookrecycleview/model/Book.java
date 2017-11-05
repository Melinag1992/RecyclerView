package com.cq4.bookrecycleview.model;

/**
 * Created by melina.gonzalez on 11/5/17.
 */

public class Book {
    private  String bookModel;
    private  String bookTitle;
    private  String bookAuthor;
    private  int publishingYear;

    public Book(String bookTitle,String bookModel,String bookAuthor, int publishingYear){

        this.bookTitle = bookTitle;
        this.bookModel = bookModel;
        this.bookAuthor = bookAuthor;
        this.publishingYear =publishingYear;


    }

    public String getBookModel() {
        return bookModel;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getPublishingYear() {
        return publishingYear;
    }
}

