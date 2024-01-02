package com.study.cho4;

public class Operation05 {
    public static void main(String[] args) {

        /*
         *  << 문제 >>
         *
         * int x = 0;
         * int y = 1;
         *
         * x와 y중 하나라도 값이 0이면 결과는 "오류"
         * 사분면
         * x 양수 이면서 y도 양수 => 1사분면
         * x 음수 이면서 y도 양수 => 2사분면
         * x 음수 이면서 y도 음수 => 3사분면
         * x 양수 이면서 y도 음수 => 4사분면
         */

        int x = -1;
        int y = 1;

        String Result = x == 0 || y == 0 ? "오류" : x > 0 && y > 0 ? "1사분면" : x < 0 && y > 0 ? "2사분면" : x < 0 && y < 0 ? "제 3사분면" : x > 0 && y < 0 ? "제 4 사분면" : "";
        String Result2 = x > 0 && y > 0 ? "1사분면" : x < 0 && y > 0 ? "2사분면" : x < 0 && y < 0 ? "제 3사분면" : x > 0 && y < 0 ? "제 4 사분면" : x == 0 || y == 0 ? "오류" : "";

        // 선생님 답
        String Result3 = x == 0 || y == 0 ? "오류"
                        : (x > 0 ? (y > 0 ? "1사분면" : "4사분면")
                        : (y > 0 ? "2사분면" : "3사분면"));

        String Result4 = x > 0 && y > 0 ? "1사분면"
                        : x < 0 && y > 0 ? "2사분면"
                        : x < 0 && y < 0 ? "3사분면"
                        : x > 0 && y < 0 ? "4 사분면" : "오류";

        System.out.println(Result4);





    }
}
