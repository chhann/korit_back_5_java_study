package com.study.honja.ch10BrushUp;

public class RemoteController extends ElectronicDevice{
    // ctrl + i 필수로 재정의 해야되는 추상(abstract) 매소드를 보여줌 !!
    @Override
    void showDeviceState() {
        System.out.println("리모컨의 상태를 확인합니다.");
    }
}
