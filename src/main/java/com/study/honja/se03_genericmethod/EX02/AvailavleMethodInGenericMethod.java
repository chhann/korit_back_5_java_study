package com.study.honja.se03_genericmethod.EX02;

class A {
    public <T> void method (T t) {
        //System.out.println(t.length()); // 불가능 : Object 메서드면 호출가능
        System.out.println(t.equals("안녕"));
    }
}

public class AvailavleMethodInGenericMethod {
    public static void main(String[] args) {
        A a = new A();
        a.<String>method("안녕");
    }
}
