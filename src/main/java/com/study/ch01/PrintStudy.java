package com.study.ch01;

public class PrintStudy {
    public static void main(String[] args) {
        System.out.println("\u0061");
        System.out.println(""+'김'+'준'+'일');
        System.out.println('김'+1);
        System.out.println('김'+'준'+'일');   // 순서 중요
        System.out.println(""+10+20);
        System.out.println(10+20);      // 순서 중요 !! : 순서대로 읽어서 "" <- 문자열로 읽어서 뒤에도 문자열로 읽힘
        System.out.println("나이:"+(10+20));      // 그래서 먼저 계산하고 싶은 식은 소괄호() 를 쓰자 !
        // 0000 0000 0000 0000
        // char자료형 -> 2바이트 ??


        // 2023-12-29 문자와 문자열
    }
}
