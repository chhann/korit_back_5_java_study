package com.study.honja.ch11BrushUp;

public class BookFactoryMain {
    public static void main(String[] args) {
        Library library = new Library();
        library.setName("동명명적");

        kyoBoLibrary kyoBoLibrary = new kyoBoLibrary();
        kyoBoLibrary.showLibraryInfo();



        Book book1 = new Book(library);
        Book book2 = new Book(library);
        Book book3 = new Book(library);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);



    }
}
