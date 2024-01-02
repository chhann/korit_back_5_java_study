package com.study.ch02;

public class Variable {
    public static void main(String[] args) {
        int date = 20231229;
        double date2 = date;        // 실수는 정수 포함 [업케스팅]
        // int date3 = date2;       // 정수는 실수를 포함 못해서 오류(빨간줄 뜸) [다운케스팅]
                                    // double(실수)가 int(정수)의 상위요소

        int date3 = (int) date2;    // [다운케스팅]은 명시를 해줘야 한다
                                    // 소수점 부분은 다 버리고 값이 담김

        // 문자 -> 정수 -> 실수

        char a = '1';
        int b = a;
        double c = b;

        System.out.println(date + 1);
        System.out.println(date + 2);
        System.out.println(date + 3);
        System.out.println(date2 + 4);
        System.out.println(20231229 + 5);
        System.out.println(20231229 + 6);
        System.out.println(20231229 + 7);
        System.out.println(20231229 + 8);
        System.out.println(20231229 + 9);


    }
}
