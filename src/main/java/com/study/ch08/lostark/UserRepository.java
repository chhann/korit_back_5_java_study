package com.study.ch08.lostark;

public class UserRepository {
    int insert (User[] users, User user) {
        for(int i = 0; i < users.length; i++ ) {
            if(users[i] == null){
                users[i] = user;
                break;
            }
        }
        System.out.println("저장소에 User저장");
        System.out.println(user.toString());
        return 1;

    }

}
