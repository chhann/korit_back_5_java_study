package com.study.ch07;

public class UserMain01 {
    public static void main(String[] args) {
        User01 user1= new User01("aaa", "1234");
        User01 user2= new User01("bbb", "1234", "이정찬","wjdcsk2252@naver.com");

        user1.showInfo();
        System.out.println("--------------------");

        user2.showInfo();
        System.out.println("--------------------");

        user1.setName("이정찬");
        user1.setEmail("wjdcks2252@naver.com");

        user1.showInfo();


    }
}
