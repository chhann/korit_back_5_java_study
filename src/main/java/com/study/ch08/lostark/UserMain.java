package com.study.ch08.lostark;

import com.study.ch08.member.Member;

import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserService userService = new UserService();
        User[] users = new User[3];

        String selectedMenu = null;

        while (true) {
            System.out.println("[[ 로스트아크 캐릭터 프로그램 ]]");
            System.out.println("1. 캐릭터 만들기");
            System.out.println("2. 캐릭터 전체 조회");
            System.out.println("q. 프로그램 종료");

            System.out.print("메뉴 선택 >>>>");
            selectedMenu = scanner.nextLine();

            if("1".equals(selectedMenu)){

                int emptyCount = 0;

                for (int i = 0; i < users.length; i++){
                    if(users[i] == null){
                        emptyCount++;
                    }
                }

                if(emptyCount == 0){
                    System.out.println("회원을 등록 할 수 없습니다.");
                    continue;
                }

                boolean responseDate = userService.addUser(users);

                if(responseDate){
                    System.out.println("등록완료");
                }else {
                    System.out.println("<<< 캐릭 생성 취소 >>>");
                }



            }else if("2".equals(selectedMenu)){
                System.out.println("<<< 캐릭 전체 조회 >>>");
                for(int i = 0; i < users.length; i++) {
                    if(users[i] == null){
                        System.out.println("NULL");
                        continue;
                    }
                    System.out.println(users[i].toString());
                }


            }else if("q".equals(selectedMenu)){
                break;
            }else {
                System.out.println("다시 선택하세요");
            }
            System.out.println();

        }
        System.out.println();
        System.out.println("<<<<<< 프로그램이 종료됬슴 >>>>>>");

    }















}
