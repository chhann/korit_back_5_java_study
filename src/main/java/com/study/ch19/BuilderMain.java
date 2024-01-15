package com.study.ch19;

public class BuilderMain {
    public static void main(String[] args) {


        // Car class 안에 있는 CarBuilder 생성자를
        Car.CarBuilder carBuilder = Car.builder();
        Car car2 = carBuilder.build();
        Car car = Car.builder().model("반떼").color("블랙").build();
        System.out.println(car2);


        Student student =
                Student.builder().name("gd").address("gdd").age(35).build();
        System.out.println(student);


        Member member = Member.builder()
                .phone("01051682220")
                .name("gd")
                .build();
    }



}
