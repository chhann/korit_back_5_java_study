package com.study.ch07.house;

public class HouseRepository {

    HouseDB houseDB = new HouseDB();

    void saveHouse (HouseMember houseMember) {

        houseDB.insert(houseMember);
    }

}
