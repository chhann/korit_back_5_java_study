package com.study.ch21;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CustomExecptionMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("1. 맴버 추가 중 예외 생성");
            System.out.println("2. 맴버 조회 중 예외 생성");
            System.out.println("q. 프로그램 종료");
            String selectMenu = scanner.nextLine();

            try {
                if("q".equalsIgnoreCase(selectMenu)){
                    break;
                }else if("1".equals(selectMenu)){
                    throw new IndexOutOfBoundsException("예외 강제로 생성");
                }else if("2".equals(selectMenu)){
                    Map<String, Object> erroMap = new HashMap<>();
                    erroMap.put("errorCode", 400);
                    erroMap.put("errorMessage", "요청 데이터가 누락되었습니다.");

                    throw new ResposeException("응답 예외", erroMap);
                }else {
                    System.out.println("다시입력");
                }
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
            }catch (ResposeException e){
                e.printStackTrace();
                System.out.println(e.getErreorMap());
            }catch (Exception e) {
                e.printStackTrace();
            }

        }

        System.out.println("프로그램종료");

    }
}
