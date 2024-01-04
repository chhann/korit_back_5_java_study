package com.study.ch07.house;

import java.util.Scanner;

public class HouseMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HouseService houseService = new HouseService();

        String houseName = null;
        long housePrice = 0;

        System.out.println("집구성원");
        houseName = scanner.nextLine();
        if(houseService.isEmpty(houseName)){
            System.out.println("집구성원들을 입력하세요");
        }

        System.out.println("집 가격");
        housePrice = scanner.nextInt();
        if(housePrice < 0){
            System.out.println("집 가격을 입력해주세요");
        }

        HouseMember houseMember = new HouseMember(houseName, housePrice);

        houseService.reposi(houseMember);






    }

}
