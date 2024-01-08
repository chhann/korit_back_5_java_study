package com.study.ch09;

public class Computer extends ElectronicDeivec{
    String cpu;
    int ram;


    void playGame() {
        System.out.println("PC 게임을 합니다.");
    }

    // 상속받은 애들 [[오버라이딩]](부모와 같은 함수 사용가능) 가능
    void showDeviceState() {
        System.out.print("컴퓨터 ");
        super.showDeviceState();
    }

}
