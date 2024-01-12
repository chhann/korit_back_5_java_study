package com.study.ch21;

import java.util.ArrayList;
import java.util.List;

public class ExeptionMain2 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("이찬");
        nameList.add(null);
        nameList.add("dlwjg");
        nameList.add("이정찬");

        for (int i = 0; i < 5; i++) {
            String name = nameList.get(i);
            try {
                if (name.equals("이정찬")) {
                    System.out.println("이정찬을 찾았다");
                }
            } catch (NullPointerException e) {
                e.printStackTrace();
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("이거는 무조건 실행됨");
            }


            System.out.println("프로그램 종료");

        }
    }
}