package com.study.ch09;

public class ElectronicDeivec {
    boolean powerState;

    void setPowerOn() {
        powerState = true;
    }

    void setPowerOff() {
        powerState = false;
    }

    void showDeviceState() {
        System.out.println("전원상태 : " + ((powerState) ? "켜짐" : "꺼짐"));
    }


}
