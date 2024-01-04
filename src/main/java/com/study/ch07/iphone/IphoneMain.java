package com.study.ch07.iphone;

import java.util.Scanner;

public class IphoneMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IphoneService iphoneService = new IphoneService();

        String iphoneSeries = null;
        String iphoneCode = null;
        long iphonePrice = 0;
        long vdQuality = 0;

        System.out.println("아이폰 몇쓰니?");

        System.out.println("iphone 시리즈");
        iphoneSeries = scanner.nextLine();
        if(iphoneService.isEmptyString(iphoneSeries)){
            System.out.println("아이폰 시리즈를 다시 입력하세요");
            return;
        }

        System.out.println("iphone 상품코드");
        iphoneCode = scanner.nextLine();
        if(iphoneService.isEmptyString(iphoneCode)){
            System.out.println("아이폰 상품 코드를 다시 입력하세요");
            return;
        }

        System.out.println("iphone 가격");
        iphonePrice = scanner.nextLong();
        if(iphonePrice < 0){
            System.out.println("아이폰가격을 다시 입력하세요");
            return;
        }


        System.out.println("iphone 화질");
        vdQuality = scanner.nextLong();
        if(vdQuality < 0){
            System.out.println("화질을 다시 입력하세요");
            return;
        }

        IphoneCharcater iphoneCharcater = new IphoneCharcater(iphoneSeries, iphoneCode, iphonePrice, vdQuality);

        iphoneService.registerProductService(iphoneCharcater);




    }
}
