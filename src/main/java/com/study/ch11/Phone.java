package com.study.ch11;

public class Phone {
    // sta
    static int autoCount = 0;
    int serialNumber;
    Company company;

    public Phone(Company company) {
        autoCount++;
        this.serialNumber = 2024000;
        this.serialNumber += autoCount;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "serialNumber=" + serialNumber +
                ", company=" + company.name +
                '}';
    }
}
