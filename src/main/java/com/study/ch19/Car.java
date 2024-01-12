package com.study.ch19;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Car {
    private String model;
    private String color;

    // 생성자는 주소를 리턴함(리턴 필요 없음)
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }



    public static CarBuilder builder() {
        // 주소 생성(ex 100)
        return new CarBuilder();
    }

    public static class CarBuilder {
        private String model;
        private String color;

        public Car build() {
            // 새로운 주소 생성 (ex 200)
            // 리턴 받은 100 주소를 [새롭게 만들어지는] 200 주소 model, color에 대입
            // 그래서 리턴this가 필요
            return new Car(model, color);

        }

        public CarBuilder model(String model) {
            // this -> 받아온 주소 (ex 100)
            // 객체 참조 ?
            // return 받아온 주소를 리턴 함
            this.model = model;
            return this;
        }

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

    }

}
