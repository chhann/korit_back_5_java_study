package com.study.ch03;

public class Function01 {
    public static void main(String[] args) {
        fx3();
        System.out.println(fx1(1,2,3,4,5)); // 함수 호출(콜)
        fx2("이정찬");
    }

    // 함수 정의 (특징: 자주 재사용하는것, 코드가 너무 길어지고 더러울때 기능적으로 분리필요)
    static int fx1(int a, int b, int c, int d, int e) {
        return a + b * c - d * e ;
    }

    static void fx2(String name) {
        System.out.println("이름은 " + name + "입니다.");
        System.out.println();

    }

    static void fx3() {
        System.out.println(1 + 2 * 3 - 2 * 3);
        System.out.println(1 + 2 * 3 - 2 * 3);
        System.out.println(1 + 2 * 3 - 2 * 3);
        System.out.println(1 + 2 * 3 - 2 * 3);
        System.out.println(1 + 2 * 3 - 2 * 3);
    }



}
