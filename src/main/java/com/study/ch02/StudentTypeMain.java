package com.study.ch02;

public class StudentTypeMain {
    public static void main(String[] args) {
        /*
         *   이름, 학년, 주소를 저장할 수 있는 StudentType 클래스를 만드시오.
         */
        StudentType chan = new StudentType();

        chan.name = "이정찬";
        chan.age = 28;
        chan.grade = "4학년";
        chan.add = "부산";

        System.out.println("이름:" + chan.name);
        System.out.println("학년:" + chan.grade);
        System.out.println("나이:" + chan.age);
        System.out.println("주소:" + chan.add);

        Person p = chan;                            // Person 에 바로 할당하는거와 new Person의 차이
        StudentType chan2 = (StudentType) p;        // 업케스팅 가능 Person이 상위요소

//      Person 전주환 = new Person();
//      StudentType 전주환학생 = (StudentType) 전주환;
//      변환을 하더라도 다운케스팅 불가 (학년, 주소의 공간에 할당을 할 수 없어서 -Peson에 학년 주소가 없기때문 !-)


        StudentType 전주환학생 = new StudentType();
        Person 전주환사람 = 전주환학생;
        StudentType 전주환학생2 = (StudentType) 전주환사람;




    }
}
