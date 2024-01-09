package com.study.ch11;

import com.study.Main;
import com.study.ch01.PrintStudy;
import com.study.ch03.Function02;
import com.study.ch10.Power;

public class FactoryMain {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("삼성");

        Phone phone1 = new Phone(company);
        Phone phone2 = new Phone(company);
        Phone phone3 = new Phone(company);
        System.out.println(Phone.autoCount);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        System.out.println(Power.ERROR_CODE);

        Function02.fx01();






    }
}
