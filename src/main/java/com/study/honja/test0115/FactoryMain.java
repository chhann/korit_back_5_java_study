package com.study.honja.test0115;

public class FactoryMain {
    public static void main(String[] args) {
        Factory factory = Factory.getInstance();
        factory.setFactoryName("java 테스트");

        System.out.println(factory.toString());
    }
}
