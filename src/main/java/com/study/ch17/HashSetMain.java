package com.study.ch17;

import com.study.ch14.ObjectTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;

public class HashSetMain {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("이정찬");
        nameList.add("정찬");
        nameList.add("찬");
        nameList.add("찬");

        System.out.println(nameList);

        // 중복제거를 위해 set을 쓴다
        HashSet<String> names = new HashSet<>();
        names.addAll(nameList);

        System.out.println("gd"+names);

        ArrayList<String> newNameList = new ArrayList<>();
        newNameList.addAll(names);
        newNameList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Objects.hash(o2) - Objects.hash(o1);
            }
        });



        String findName = null;
            for(String name : names){
                if(name.equals("삼정찬")){
                    findName = name;
                    break;
                }
            }


        for(String name : names){
            System.out.println(name);
        }








    }









}
