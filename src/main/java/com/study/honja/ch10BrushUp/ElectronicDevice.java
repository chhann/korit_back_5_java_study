package com.study.honja.ch10BrushUp;

public abstract class ElectronicDevice {
    boolean powerState;

    void setPowerOn() {
        powerState = true;
    }
    void setPowerStateOff(){
        powerState = false;
    }

    abstract void showDeviceState();


}
