package com.study.ch05;

import java.util.Scanner;

public class UserInfoMain {
    public static void main(String[] args) {
        /*
        * 이름 : 이정찬
        * 나이 : 29
        * 연락처: 01051682220
        * 학년: 4
        * 주소 : 부산 부산진구
         */
        Scanner scanner = new Scanner(System.in);

        String name = null;
        int age = 0;
        String phonNumber = null;
        int grade = 0;
        String address = null;


        System.out.print("이름: ");
        name = scanner.nextLine();

        System.out.print("나이: ");
        age = scanner.nextInt();

        System.out.print("연락처: ");
        scanner.nextLine();
        phonNumber = scanner.nextLine();

        System.out.print("학년: ");
        grade = scanner.nextInt();

        System.out.print("주소: ");
        scanner.nextLine();
        address = scanner.nextLine();

        System.out.println("이름 :" + name);
        System.out.println("나이 :" + age);
        System.out.println("연락처 :" + phonNumber);
        System.out.println("학년 :" + grade);
        System.out.println("주소 :" + address);


    }
}
