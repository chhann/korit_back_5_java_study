package com.study.ch21;

import com.study.ch19.Member;

import java.util.ArrayList;

public class MemberMain {
    public static void main(String[] args) {

        ArrayList<Member> members = new ArrayList<>();
        members.add(Member.builder().name("이정찬").build());
        members.add(Member.builder().name("이정찬").build());
        members.add(Member.builder().name("이정찬").build());
        members.add(Member.builder().name("이정찬").build());

        MemberService memberService = new MemberServiceImp();

        try {
            memberService.printMemberList(members);
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println(" 프로그램종료");

    }

}
