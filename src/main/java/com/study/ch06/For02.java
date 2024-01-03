package com.study.ch06;

public class For02 {
    public static void main(String[] args) {
        /*
        * 0,1,3,4
        */

        for(int i=0; i<20; i++){
            System.out.print(i);
            if(i % 5 != 4){
                System.out.print(",");
            }
            if(i % 5 == 4){
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
        // for문은 횟수중심!! () 안에서 바꾸려하지말고 밖에서 바ㅜ꺼라
        int n = 10;

        for(int i=0; i < n; i++){
            int rv_i = n - 1 - i;
            System.out.print(rv_i);

            if(rv_i % 5 != 0){
                System.out.print(", ");
            }if(rv_i % 5 == 0){
                System.out.println();
            }
        }



    }
}
