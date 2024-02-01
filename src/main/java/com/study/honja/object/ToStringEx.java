package com.study.honja.object;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

public class ToStringEx {
    public static void main(String[] args) {

        Book book = new Book("두잇자바", "은총님");
        System.out.println(book);

        String str = new String("tset");
        System.out.println(str);

    }
}
