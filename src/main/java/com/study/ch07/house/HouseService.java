package com.study.ch07.house;

public class HouseService {

    boolean isEmpty(String str) {
        if( str == null ){
            return true;
        }
        return str.isBlank();
    }

    HouseRepository houseRepository = new HouseRepository();

    void reposi (HouseMember houseMember) {
        houseRepository.saveHouse(houseMember);
    }




}
