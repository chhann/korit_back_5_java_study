package com.study.ch09;

public class ElectronicDeviceMain {
    public static void main(String[] args) {
        ElectronicDeivec[] electronicDeivecs = new ElectronicDeivec[10];


        for(int i = 0; i < electronicDeivecs.length; i++){
            electronicDeivecs[i] = i % 2 == 0 ? new Computer() : new SmartPhone();
        }

        for (int i = 0; i < electronicDeivecs.length; i++){
            electronicDeivecs[i].showDeviceState();
        }

        for (int i = 0; i < electronicDeivecs.length; i++){
            electronicDeivecs[i].setPowerOn();
        }

        System.out.println("gg");

        for (int i = 0; i < electronicDeivecs.length; i++){
            electronicDeivecs[i].showDeviceState();
        }



        System.out.println();

        for (int i = 0; i < electronicDeivecs.length; i++){
            if(electronicDeivecs[i] instanceof Computer){
                Computer computer = (Computer) electronicDeivecs[i]; // 이게 몰까 () 하고 자료형을 넣으면 되는건지 물어보기, 다운케스팅이라서
                computer.playGame();
            } else if(electronicDeivecs[i] instanceof SmartPhone){
                SmartPhone smartPhone = (SmartPhone) electronicDeivecs[i];
                smartPhone.call();
            }
        }



    }
}
