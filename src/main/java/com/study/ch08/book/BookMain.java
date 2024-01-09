package com.study.ch08.book;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String selectMenu = null;
        boolean loopFlag = true;

        Book [] books = new Book[3];

        BookRepository bookRepository = new BookRepository(books);
        BookService bookService = new BookService(bookRepository);

        while (loopFlag){
            System.out.println("[[ 도서관 ]]");
            System.out.println("1. 책 등록");
            System.out.println("2. 책 조회");
            System.out.println("q. 프로그램 종료");
            System.out.println("메뉴 선택 >>>>");
            selectMenu = scanner.nextLine();


            if("q".equalsIgnoreCase((selectMenu))){
                System.out.println("프로그램 종료중 ...");
                loopFlag = false;

            }else if("1".equalsIgnoreCase(selectMenu)){
                System.out.println("책 등록 페이지 >>>");

                String bookName = null;
                String bookAuthor = null;

                if(bookService.isFull()){
                    System.out.println("더이상 책 등록할 수 없습니다");
                    continue;
                }

                System.out.println("책 제목 >>>");
                bookName = scanner.nextLine();
                System.out.println("책 저자 >>>");
                bookAuthor = scanner.nextLine();

                Book book = new Book(bookName, bookAuthor);
                bookService.append(book);




            }else if("2".equalsIgnoreCase(selectMenu)){
                System.out.println("<<< 책 조회 페이지 >>>");
                bookService.printBookList();

            }else {
                System.out.println("다시 입력하세요.");
            }

        }
        System.out.println();
        System.out.println("<<<<<<프로그램이 종료되었습니다>>>>>>");


    }
}
