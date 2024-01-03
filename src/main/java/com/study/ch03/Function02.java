package com.study.ch03;

public class Function02 {

   public static void fx01() {
       // fx()에서 () 가 매개변수
       // void -> 비어있는, 공허한
       System.out.println("fx01 함수 실행");
       System.out.println();
   }

  // [함수의 오버로딩]
  // : 함수명이 같아도, 매소드명이 같아도 매개변수의 자료형의 자리가 다르면 함수 정의가 가능하다 (요류가 발생하지않는다)
   public static void fx02(int age, String name) {
       // (age, name) : 지역변수
       System.out.println("fx02 함수 실행");
       System.out.println("나이: " + age);
       System.out.println("이름: " + name);
       System.out.println();
   }
   public static void fx02(String name, int age) {
       // (age, name) : 지역변수
       System.out.println("fx02 함수 실행");
       System.out.println("나이: " + age);
       System.out.println("이름: " + name);
       System.out.println();
   }

   public static int fx03() {
       System.out.println("fx03 함수 실행");
       return 100;
   }

   public static String fx04(String name, int age) {
       return name + ", "+age;
   }

   public static void main(String[] args) {
       fx01();

       fx02(29,"이정찬");
       fx02("이정찬",29);

       int num = fx03();
       System.out.println(fx03());
       System.out.println();

       String result = fx04("이정찬", 29);
       System.out.println(result);

   }



}
