package com.study.ch08;

import java.util.Arrays;
import java.util.Scanner;

public class TestFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int [] array;
        array = new int[3];

        int index1 = array[0];
        int index2 = array[1];
        int index3 = array[2];


        System.out.println("array배열의 index0번에 넣기");
        index1 = scanner.nextInt();

        System.out.println("array배열의 index1번에 넣기");
        index2 = scanner.nextInt();

        System.out.println("array배열의 index2번에 넣기");
        index3 = scanner.nextInt();



        int emptyCount = 0;

        while (true){
            for(int i = 0; i < array.length; i++){
                System.out.println(index1+"gdgdgit add ggitg");
                if(array[i] == 0){
                    emptyCount++;
                }
            }
            System.out.println(emptyCount);

            System.out.println(index1+"인덱스1");

            if(emptyCount == 0){
                System.out.println("array배열에 3개다 0이 아님");
            }else if(emptyCount == 1){
                System.out.println("array배열이 1개는 0 입니다.");
            }else if(emptyCount == 2){
                System.out.println("array배열이 2개는 0 입니다.");
            }else {
                System.out.println("3개다 0임");
            }

            for(int i = 0; i <3; i++){
                System.out.println(array[i]);
            }

            break;
        }


    }
}
