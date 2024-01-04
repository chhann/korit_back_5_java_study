package com.study.ch07;

public class Comnputer {
    String type;
    String cpu;
    String ram;
    String disk;

    // 생성자 :
    // 1. 클래스 이름과 같다.
    // 2. 메소드의 형태이다.
    // 3. 앞글자가 대문자이다.

    // 주소를 리턴한다 ?
    // 그래서 생성자 메소드는 필요없다
    Comnputer(){
        type = "컴퓨터";
    }

    Comnputer(String type){
        this.type = type;
    }

    // 클래스안에 정의된 함수는 메소드라고 부름
    // showInfo 함수 x / showInfo 메소드 o
    void showInfo(){
        System.out.println("type: "+ type);
        System.out.println("cpu: "+ cpu);
        System.out.println("ram: "+ ram);
        System.out.println("disk: "+ disk);
    }
}
