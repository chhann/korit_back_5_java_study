package com.study.ch10;

/*
* (추상 : 공통점을 뽑아넨다)
* [ 추상화 ]
* 1. 추상 클래스 abstract class
* 2. 인터페이스 interface
* */
public abstract class ElectronicDevice {
    boolean powerState;

    void setPowerOn() {
        powerState = true;
    }

    void setPowerOff() {
        powerState = false;
    }

    // 추상 클레스에는 평범한 메소드 못만듬 -> 추상 메소드를 만들어야함
    // 추상 메소드 ({} 중괄호 필요없음)
    // 인터페이스와 추상 class 에서만 정의 가능하다 !!
    abstract void showDeviceState();








}


