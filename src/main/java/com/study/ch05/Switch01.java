package com.study.ch05;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = null;

        System.out.println("번호 선택: ");
        num = scanner.next();

        switch (num) {
            case "0":
                System.out.println("0선택");
                break;
            case "1":
                System.out.println("1선택");
                break;
            case "2":
                System.out.println("2선택");
                break;
            default:
                System.out.println("오류");
        }

        if ("0".equals(num)) {
            System.out.println("0선택ㅎ");
        } else if("1".equals(num)){
            System.out.println("1선택ㅎ");
        } else if("2".equals(num)){
            System.out.println("2선택ㅎ");
        } else {
            System.out.println("오류ㅎ");
        }







    }
}
