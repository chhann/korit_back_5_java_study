package com.study.honja.se02_genericclass.EX03;

import com.study.ch13.A;

class Apple {}
class Pencil {}

class Goods <T> {
    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}
public class Solution2_Generic {
    public static void main(String[] args) {
        //#1. Goods을 통해서 Apple 격체 추가 및 가져오기
        Goods<Apple> goods1 = new Goods<>();
        goods1.set(new Apple());
        Apple apple = goods1.get(); // 다운캐스팅 필요 없음

        //#2. Goods을 통해서 Pencil 격체 추가 및 가져오기
        Goods<Pencil> goods2 = new Goods();
        goods2.set(new Pencil());
        Pencil pencil = goods2.get();

        //#3. 잘못된 캐스팅 (약한 타입체크)
        Goods<Apple> goods3 = new Goods();
        goods3.set(new Apple());
//      Pencil pencil1 = goods3.get(); // 강한타입체크

    }
}
