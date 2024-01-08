package com.study.ch08.car;

public class CarService {

    CarRepository carRepository;

    CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }
}
