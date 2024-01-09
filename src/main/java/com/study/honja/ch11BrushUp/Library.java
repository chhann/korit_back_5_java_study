package com.study.honja.ch11BrushUp;

public class Library {
    String name;

    void setName(String name){
        this.name = name;
    }

    void showLibraryInfo() {
        System.out.println("서점명 :"+name);
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                '}';
    }
}
