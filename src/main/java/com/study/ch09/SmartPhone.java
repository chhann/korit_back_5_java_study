package com.study.ch09;

public class SmartPhone extends ElectronicDeivec{
    String model;
    String color;

    void call() {
        System.out.println("전화 연결을 시도합니다.");
    }



    // 오버라이드 단축키 ctrl + o
    @Override // @로 시작하면 [어노테이션]
    void showDeviceState() {
        super.showDeviceState();
    }
}
