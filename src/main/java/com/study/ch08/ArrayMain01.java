package com.study.ch08;

import java.util.Scanner;

public class ArrayMain01 {
    public static void main(String[] args) {

        // 자료구조(데이터 구조), 자료형(데이트의 형태)
        // 데이터를 저장하는 형식 알고리즘


        // 배열(Aaary)
          int[] aAaary  =   new int[3];
        // 자료형  변수  대입     값

        // 정수 형 자료값 배열을 만들면
        // 정수자료형이 들어간다x  정수형 배열이 들아간다.o
        // 배열은 크기를 조절할 수 없다.

        // 스텍메모리 계속실행 메모리?
        // 동적 메모리 할당 (힙: 메모리 )

        // Index 0 = 100
        // Index 1 = 104
        // Index 2 = 108

        int num1 = 10;
        int num2 = 20;

        int [] numArray; // 선언

        numArray = new int[3]; // 값(주소) 대입

        numArray[0] = 10;
        System.out.println(numArray[0]);

        numArray[1] = 20;
        numArray[2] = 30;
        Scanner scanner = new Scanner(System.in);
        System.out.println("인덱스");
        int index = scanner.nextInt();

        System.out.println(numArray[index]);




    }
}
