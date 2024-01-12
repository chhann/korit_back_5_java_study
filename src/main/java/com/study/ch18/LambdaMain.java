package com.study.ch18;

import com.study.ch16.Member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LambdaMain {
    public static void main(String[] args) {

        Runnable start = () -> {
            System.out.println("프로그램을 실행합니다.");
            System.out.println("데이터를 초기화 합니다.");
            int a = 10;
            int b = 20;
            System.out.println("a + b=" +(a + b));
        };

         start.run();

        Supplier<Integer> supplier1 = () -> 10;

        int a = supplier1.get();
        System.out.println(a);

        Supplier<Scanner> scannerInstance = () -> new Scanner(System.in);
//        scannerInstance.get().nextLine();


        // 매개변수 o, 반환값 x
        Consumer<String> setName = name -> {
            String newName = name + "님";
            System.out.println(newName);
        };
        setName.accept("이정찬");

        ArrayList<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");

        // accept 이 함수안엔 System.out.println 이 들어있다
        // str -> System.out.println(str) 이거 자체가 객체
        // 호출은 따로 이뤄져야 한다.
        Consumer<String> action = str -> System.out.println(str);
        action.accept("ㅊㅊㅊ");

        // forEach 안에 반복문과 accept 함수가 있다
        strList.forEach(str -> System.out.println(str));

        Function<Integer, String> fx1 = num -> Integer.toString(num * num);

        String result = fx1.apply(10);
        System.out.println(result);

        String result2 = fx1.andThen(num -> {
            System.out.println("andThen에 넣은 함수" + num);
            return "문자열" + num;
        }).apply(10);

        System.out.println(result);

        Predicate<Integer> fillterFx = num -> num % 2 == 0;

        List<Integer> numList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            numList.add(i + i);
        }
        System.out.println(numList);


        // 새로운 stream 자료형으로 num -> num % 2 == 0 이조건에 맞는 것들만 바뀐다
        // filter는 조건을 달아 걸러 다시 넣는거
        List<Integer> newList = numList.stream().filter(fillterFx).collect(Collectors.toList());
        System.out.println(newList);

        // newList 안에 있는 것들을 num -> num*2 으로 연산해 새로운 stream에 넣는다 stream 을 list로 바꾼다(Collectors)로 인하여
        // funciton 은 매개를 받아와서 return을 한다 [기본형태]
        // map은 형태를 바꿔서 나오는 값을 다시 넣는거
        List<Integer> newList2 = numList.stream().map(num -> num*2).collect(Collectors.toList());
        System.out.println(newList2);

    }
}
