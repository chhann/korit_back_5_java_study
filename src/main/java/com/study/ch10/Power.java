package com.study.ch10;

// interface 는 기본적으로 (abstract)추상 메소드이다.
public interface Power {
    // interface 특징
    // 변수 선언이 안된다.
    // ex) boolean powerState; (오류뜸)

    // 상수 선언만 가능하다.
    boolean powerState = false;
    String ERROR_CODE = "-99990";


    void setPowerOn();
    void setPowerOff();

    // 안붙이면 일반 추상 메소드
    // default 붙으면 일반 메소드

    default void test() {

    }

}
