package com.study.ch10;


public class ElectronicDeviceMain {
    public static void main(String[] args) {
        // 추상 클래스는 생성할 수 없다
        // ElectronicDevice electronicDevice = new ElectronicDevice() "사용불가"
        // 사용 할려면 추상이 아니라 명확 해야됨 !


        new RemoteController();

        // 익명클래스
        ElectronicDevice  electronicDevice = new ElectronicDevice() {
            @Override
            void showDeviceState() {
                System.out.println("첫번째 기기 상태확인");
            }
        };

        ElectronicDevice electronicDevice2 = new ElectronicDevice() {
            @Override
            void showDeviceState() {
                System.out.println("두번째 기기 상태확인");
            }
        };

        // RemoteController 는 ElectronicDeviceMain 의 상속을 받았더라도 되는 이유는
        // RemoteController 자체가 그냥 일반 class 이기때문에
        //        ElectronicDevice electronicDevice = new ElectronicDevice()
        RemoteController remoteController = new RemoteController();

        ElectronicDevice[] electronicDevices = new ElectronicDevice[3];
        electronicDevices[0] = electronicDevice;
        electronicDevices[1] = electronicDevice2;
        electronicDevices[2] = remoteController;

        for(int i = 0; i < electronicDevices.length; i++){
            electronicDevices[i].showDeviceState();
        }


    }
}

