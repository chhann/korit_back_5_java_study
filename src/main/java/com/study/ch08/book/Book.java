package com.study.ch08.book;

public class Book {
    String bookName;
    String bookAuthor;

    Book(String bookName,  String bookAuthor){
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                '}';
    }
}
