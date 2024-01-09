package com.study.ch13;

import java.util.Scanner;

public class FactoryMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Factory factory = new Factory();

        FactoryService factoryService = new FactoryService(scanner);
        FactoryService2 factoryService2 = new FactoryService2(scanner);

        factoryService.create();
        factoryService2.create();





    }
}
