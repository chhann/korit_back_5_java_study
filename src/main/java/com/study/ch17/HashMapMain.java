package com.study.ch17;

import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("username", "wjdcks");
        map.put("password", "1234");
        map.put("name", "이찬");
        map.put("email", "wjdcks2252@naver.com");

        System.out.println(map);
        System.out.println(map.get("email"));

        System.out.println();
        System.out.println();

        map.forEach((k, v) -> {
            System.out.println("key: "+k);
            System.out.println("value: "+v);
        });


    }
}
