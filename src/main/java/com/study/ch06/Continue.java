package com.study.ch06;

public class Continue {
    public static void main(String[] args) {

        for(int i = 0; i <10; i++){
            System.out.println("i: " + i);
            if (i % 2 != 0){
                continue;
            }
            // continue ; if가 false일때 밑에를 실행시켜라
            System.out.println("for문 마지막");
        }
        // for(int i = 0; i <10; i++){
        //            System.out.println("i: " + i);
        //            if (i % 2 != 0){
        //                System.out.println("for문 마지막");
        //                System.out.println("for문 마지막");
        //                System.out.println("for문 마지막");
        //                System.out.println("for문 마지막");
        //                System.out.println("for문 마지막");
        //                System.out.println("for문 마지막");
        //            }
        // }
        // 이렇게 하지 않기 위해




    }
}
