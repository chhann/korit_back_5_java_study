package com.study.ch14;

import lombok.*;


@NoArgsConstructor
// 파라미터가(매개변수) 없는 생성자를 생성한다.
@AllArgsConstructor
// 클래스에 존재하는 모든 필드에 대한 생성자를 자동으로 생성한다.
@Data
// 종합세트
// @Getter / @Setter / @ToString / @EqualsAndHashCode
public class Student {
    private String name;
    private String phone;
    private String address;
    private int age;


}
