package com.study.ch02;

public class ConstantMain {
    // Constant(변하지않는)
    public static void main(String[] args) {
        // 상수
        // 대문자로만 표기한다.
        // 최초 한번만 대입이 가능하다.
        // 무조건 초기화가 되어야 한다.
        final String FILE_PATH = ""; // 대입이 되어있어야 사용가능(초기화가 되어야한다는데 ??)

        System.out.println(FILE_PATH);

    }
}
