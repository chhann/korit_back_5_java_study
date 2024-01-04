package com.study.ch07;

public class Student01 {
    String name;
    int age;
//    String address;
    final String address;

    // 생성자 contructor
    // args(arguments) <- 매개변수

    // 매개면수가 없어서
    // NoArgsConstructor
//    Student01() {
//
//    }

    // 매개변수 다 가져와서
    // AllArgsConstructor
    Student01(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // RequiredArgsConstructor
    Student01(String name, String address) {
        this.address = address;
        this.name = name;
    }



}
