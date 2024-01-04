package com.study.ch07;

public class ComnputerMain {
    public static void main(String[] args) {

        // 생성 ex: 객체를 , 인스턴스를 생성한다 [메모리를 할당한다]
        // 스텍 메모리 : 정해져있는 메모리 (정적 메모리)
        // 힙 메모리 : 늘고 줄어들고 하는 메모리 (동적 메모리)
        Comnputer comnputer1 = new Comnputer();
        Comnputer comnputer2 = new Comnputer("노트북");


        // 실제로는 주소값이다 = commputer
        System.out.println(comnputer1);
        //com.study.ch07.Comnputer@49e4cb85 <- 인스턴스의 주소
        System.out.println(comnputer2);
        //com.study.ch07.Comnputer@2133c8f8


        comnputer1.cpu = "i5";
        comnputer2.cpu = "i7";
        comnputer1.showInfo();
        comnputer2.showInfo();

        comnputer1.ram = "8GB";
        comnputer2.ram = "16GB";
        comnputer1.showInfo();
        comnputer2.showInfo();

        comnputer1.type = "데스크탑";

    }
}
