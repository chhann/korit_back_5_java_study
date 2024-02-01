package com.study.honja.object;

import java.util.Objects;

class Student {
    int studentID;
    String studentName;

    Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Student) {
            Student std = (Student) o;

            if(studentID == std.studentID)
                return true;
            else
                return false;
        }
        return false;
    }

    public int hashCode() {
        return studentID;
    }


}

public class EqualsTest {
    public static void main(String[] args) {
        String str1 = new String("test");
        String str2 = new String("test");

        System.out.println(str1 == str2);       // 주소 값이 같은지(두 인스턴스가 같은 힙 메모리인지)
        System.out.println(str1.equals(str2));  // 문자열이 같은지 (값이 같은지 ex: )

        Student std1 = new Student(1001, "tomas");
        Student std2 = new Student(1001, "tomas");

        System.out.println(std1 == std2);
        System.out.println(std1.equals(std2));

        System.out.println(std1.hashCode());
        System.out.println(std2.hashCode());
        System.out.println(System.identityHashCode(std2));

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());






    }
}
