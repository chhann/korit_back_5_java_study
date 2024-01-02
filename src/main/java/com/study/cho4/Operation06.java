package com.study.cho4;

public class Operation06 {
    public static void main(String[] args) {
        /*
         *  << 조건연산자(삼항연산자) >>

         * a > 0 ? "양수" : a == 0 ? "0" : "음수"
         */

        int iResult = 10 > 2 ? 1111 : 2222;
        Integer iResult2 = 10 > 2 ? 111 : 222;
        // int iResult = 10 > 2 ? 1111 : "2222";
        // 결과값들의 자료형이 같아야한다 "2222" => 2222

        String sResult = 10 > 2 ? "1111" + 1 : "2222";
        Boolean bResult = 10 > 2;


        //////////////////////////////////////////////////////////////////////////////////
        Boolean.parseBoolean("true");

        String name = null; // null -> 주소가 없다 (주소가 0번이다)
        System.out.println(name == null);


        //////////////////////////////////////////////////////////////////////////////////
        String name5 = "이정찬";
        String name6 = new String("이정찬");

        System.out.println( name5 == name6);
        System.out.println( name5 == "이정찬");


        //////////////////////////////////////////////////////////////////////////////////
        // null.eqals("이정찬");     // [참조] eqals는 근본적인 데이터를 비교함 . 전에 상수가 아닌 이상
                                    // null 은 아무것도 아니기에(주소가 없기에) 애초에 성립 x

        "이정찬".equals(name);       //





    }
}
