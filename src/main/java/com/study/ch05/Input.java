package com.study.ch05;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);


        System.out.print("a: ");
        int a = scanner.nextInt();

        System.out.print("b: ");
        int b = scanner.nextInt();

        System.out.print("c: ");
        int c = scanner.nextInt();

        System.out.println("타이틀: ");
        scanner.nextLine();
        String title = scanner.nextLine();
        // 버퍼의 원리
        // : nextInt 는 값을 입력하고 enter를 치면 그 버퍼의 enter가 남아있다
        // : nextLine 는 앞의 enter를 가지고온다 그래서 입력을 무시하고 바로 결과가 나옴





        System.out.println(title + ": " + (a + b + c));
    }
}
