package com.study.ch08.lostark;

public class User {
    String nickName;
    String characterClass;
    int level;


    User(String nickName, String characterClass, int level){
        this.nickName = nickName;
        this.characterClass = characterClass;
        this.level = level;
    }

    @Override
    public String toString() {
        return "User{" +
                "nickName='" + nickName + '\'' +
                ", characterClass='" + characterClass + '\'' +
                ", level=" + level +
                '}';
    }



}
