package com.study.ch12.a;

import jdk.nashorn.api.tree.SpreadTree;

public class Student {
    private String name;
    private String address;

    public Student() {

    }

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name + address;

    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void test () {
        System.out.println("10 + 20");
        System.out.println("20 + 30");
        System.out.println("40 + 50");
    }

    private int add(int a, int b ){
    return a+b;
    }



}
