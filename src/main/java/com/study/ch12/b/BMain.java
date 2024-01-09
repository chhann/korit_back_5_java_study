package com.study.ch12.b;

import com.study.ch12.a.Student;

public class BMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.test();
        student.setName("이정찬");
        student.setAddress("섯울");
        System.out.println(student.getName());

    }
}
