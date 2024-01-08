package com.study.ch08.car;

public class Car {
    String model;
    String color;


    // NoArgsConstructor
    Car(){

    }


    // AllArgsConstructor
    Car(String model, String color){
        this.model = model;
        this.color = color;
    }

    // Alt + ins  --> toString 클릭
    @Override
    public String toString() {
        return "Car{" +
                // \역슬러시 + ",'   : 역슬러시 뒤에는 문자로 보겠다
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
