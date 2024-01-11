package com.study.ch16;

import java.util.ArrayList;  // util에 Scanner도 있다.

public class StrArrayListMain {

    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        //<E> -> element // ArrayList는 알아서 크기 조절해줌.
        // 자료형도 상관없이 넣을 수 있다? -> 맞는듯. 확인 필요.
        // 배열(인덱스 이용?)과 리스트(OOO??)를 합쳐진게 ArrayList이다.

        strList.add("a");    // 데이터 추가
        strList.add("b");
        strList.add("c");
        strList.add("d");

        System.out.println(strList);
        System.out.println(strList.get(1));   // b이다.
        System.out.println(strList.indexOf("C"));  //
        strList.remove(1); // b가 지워진다.
        System.out.println(strList);
    }
}
