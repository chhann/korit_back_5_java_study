package com.study.ch05;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        /*
         *  << 문제 >>
         *
         * int x = 0;
         * int y = 1;
         *
         * x와 y중 하나라도 값이 0이면 결과는 "오류"
         * 사분면
         * x 양수 이면서 y도 양수 => 1사분면
         * x 음수 이면서 y도 양수 => 2사분면
         * x 음수 이면서 y도 음수 => 3사분면
         * x 양수 이면서 y도 음수 => 4사분면
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("x와 y를 입력해주세요(띄어쓰기로 구분): ");
        int x = 0;
        int y = 0;

        x = scanner.nextInt();
        y = scanner.nextInt();



        if( x > 0 && y > 0) {
            System.out.println("1사분면");
        } else if( x < 0 && y > 0) {
            System.out.println("2사분면");
        } else if( x < 0 && y < 0) {
            System.out.println("3사분면");
        } else if( x > 0 && y < 0 ) {
            System.out.println("4사분면");
        } else {
            System.out.println("오류");
        }
    }
}
