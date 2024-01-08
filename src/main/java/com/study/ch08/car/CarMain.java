package com.study.ch08.car;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String selectedMenu = null;

        boolean loopFlag = true;

        Car[] cars = new Car[3];
        CarRepository carRepository = new CarRepository(cars);
        CarService carService = new CarService(carRepository);
//        carService.carRepository = carRepository;

        while (loopFlag){
            System.out.println("자동차 관리 프로그램");
            System.out.println("1. 자동차 등록");
            System.out.println("2. 자동차 조회");
            System.out.println("q. 프로그램 종료");
            System.out.println("메뉴 선택 >>>");
            selectedMenu = scanner.nextLine();

            // equalsIgnoreCase 대소문자 상관없이 비교해서 같으면 참
            if("q".equalsIgnoreCase(selectedMenu)){
                System.out.println("프로그램 종료중...");
                loopFlag = false;

            } else if("1".equals(selectedMenu)) {
                System.out.println("자동차 등록 페이지 >>>");
                int emptyCount = 0;

                String model = null;
                String color = null;

                // 배열을 가지고오는것 자체 레파지토리를 확인한다.
                // 비어있는 공간을 확인한다 service

                for(int i = 0; i < cars.length; i++){
                    if(cars[i] == null){
                        emptyCount++;
                    }
                }

                if(emptyCount == 0){
                    System.out.println("더이상 등록할 수 없습니다.");
                    continue;
                }


                System.out.println("모델명 >>>");
                model = scanner.nextLine();
                System.out.println("색상 >>>");
                color = scanner.nextLine();

                Car car = new Car(model, color);
//                System.out.println(cars[0].toString());

                for(int i = 0; i < cars.length; i ++) {
                    if(cars[i] == null){
                        cars[i] = car;
                        break;
                    }
                }



            }else if("2".equals(selectedMenu)) {
                System.out.println("<<< 자동차 조회 페이지 >>>");
                for(int i = 0; i < cars.length; i ++){
                    System.out.print("["+i+"]>");
                    // 왜 멈춤?
                    if(cars[i] == null){
                        System.out.println("x");
                        continue;
                    }
                    System.out.println(cars[i].toString());
                }

            } else {
                System.out.println("다시 입력하세요.");
            }


        }
        System.out.println("프로그램이 종료되었습니다.");

    }




}
