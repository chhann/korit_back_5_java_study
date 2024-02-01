package com.study.ch14;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
// 초기화 되지 않은 final 필드나 @NonNull 어노테이션이 붙은 필드에 대해 생성자를 만들어 준다

@AllArgsConstructor
@Data

public class Student2 {
    private final String name;
    private String address;
    @NonNull
    // null 체크를 해줍니다. 즉, 해당 변수가 null 로 넘어온 경우, NullPointerException 예외를 일으켜 줍니다.
    private String phone;


}
