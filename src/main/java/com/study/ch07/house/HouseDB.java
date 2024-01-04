package com.study.ch07.house;

public class HouseDB {

    void insert(HouseMember houseMember){

        System.out.println("DB 인설트 완료");
        System.out.println("집 정보");
        System.out.println("집 구성원: " + houseMember.name);
        System.out.println("집 가격: " + houseMember.price);
        System.out.println();

    }

}
