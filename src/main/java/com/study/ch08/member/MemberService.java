package com.study.ch08.member;

import java.util.Scanner;

public class MemberService {

    String inputValue (String label) {
        Scanner scanner = new Scanner(System.in);
        String value = null;

        while (true){
            System.out.println(label + "(입력취소: exit) >>> ");
            value = scanner.nextLine();

            if(!value.isBlank()) {
                break;
            }
        }
        return value;
    }


    boolean addMember (Member[] members) {
        String code = null;
        String name = null;
        String age = null;
        String address = null;

        System.out.println("<<< 회원 등록 >>>");
        code = inputValue("회원코드");
        if(code.equalsIgnoreCase("exit")) {
            return false;
        }
        System.out.println("exit".equalsIgnoreCase(code));

        name = inputValue("이름");
        if("exit".equalsIgnoreCase(name)) {
            return false;
        }
        System.out.println("exit".equalsIgnoreCase(name));

        age = inputValue("나이");
        if("exit".equalsIgnoreCase(age)) {
            return false;
        }
        System.out.println("exit".equalsIgnoreCase(age));


        address = inputValue("주소");
        if("exit".equalsIgnoreCase(address)) {
            return false;
        }
        System.out.println("exit".equalsIgnoreCase(address));

        //  int parseInt(String, int)   int parseInt(CharSequence, int, int, int)   int parseInt(String)
        // parseInt -> 숫자배열로 바꿈
        Member member = new Member(code, name, Integer.parseInt(age), address);

        MemberRepository memberRepository = new MemberRepository();



        return memberRepository.insert(members, member) > 0;

    }







}
