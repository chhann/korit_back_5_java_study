package com.study.ch21;

import java.util.ArrayList;

import com.study.ch19.Member;

public class MemberServiceImp implements MemberService{

    @Override
    public void printMemberList(ArrayList<Member> member) throws Exception
    {
        for(int i = 0; i < 5; i++){
            System.out.println(member.get(i));
        }
    }
}
