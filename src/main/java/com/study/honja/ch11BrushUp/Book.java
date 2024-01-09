package com.study.honja.ch11BrushUp;



public class Book {
    static int autoCount = 0;
    int serialNumber;
    Library library;

    public Book(Library library){
        autoCount++;
        this.serialNumber = 2020;
        this.serialNumber += autoCount;
        this.library = library;
    }

    @Override
    public String toString() {
        return "Book{" +
                "serialNumber=" + serialNumber +
                ", library=" + library +
                '}';
    }
}
