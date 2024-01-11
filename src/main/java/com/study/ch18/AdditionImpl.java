package com.study.ch18;

public class AdditionImpl implements Addition{
    @Override
    public int add(int X, int Y) {
        System.out.println("AddtionImp에서 호출한 add 메소드");
        return X + Y;
    }
}
