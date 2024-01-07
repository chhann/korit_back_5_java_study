package com.study.ch08.lostark;

import java.util.Scanner;

public class UserService {
    Scanner scanner = new Scanner(System.in);


    String inputValue (String label) {
        String value = null;

        while (true) {
            System.out.println(label + "(입력취소: exit) >>>");
            value = scanner.nextLine();

            if(!value.isBlank()){
                break;
            }
        }
        return value;
    }




    boolean addUser (User[] users){
        String nickName = null;
        String characterClass = null;
        String level = null;


        System.out.println("<< 캐릭 만들기 >>");
        nickName = inputValue("닉네임");
        if("exit".equals(nickName)){
            return false;
        }

        characterClass = inputValue("직업");
        if("exit".equals(characterClass)){
            return false;
        }

        level = inputValue("레벨");
        if("exit".equals(level)){
            return false;
        }

        User user = new User(nickName, characterClass, Integer.parseInt(level));

        UserRepository userRepository = new UserRepository();

        return userRepository.insert(users, user) > 0;







    }





}
