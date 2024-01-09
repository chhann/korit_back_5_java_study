package com.study.honja.ch10BrushUp;

public interface Power {
    boolean ababc = false;
    String ERROR = "-1";

    void setPowerOn();
    void setPowerOff();
    // interface 는 기본적으로 (abstract)추상 메소드이다.
    // 변수 선언이 안된다.
    // ex) boolean powerState; (오류뜸)

    // 상수 선언만 가능하다.
    // 안붙이면 일반 추상 메소드
    // default 붙이면 일반 메소드
    // ex)
    //      default void test() {
    //
    //      }
}
