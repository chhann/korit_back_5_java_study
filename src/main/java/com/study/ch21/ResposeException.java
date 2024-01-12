package com.study.ch21;

import lombok.Getter;

import java.util.Map;

@Getter
public class ResposeException extends RuntimeException {
    private Map<String, Object> erreorMap;

    public ResposeException(String message){
        super(message);
    }

    public  ResposeException (String message, Map<String, Object> errorMap) {
        super(message);
        this.erreorMap = errorMap;
    }
}

class A {
    void test() {
        "hi"
    }
}
1
class B {
    print A a;

    public  B () {
        a =new A();
    }

    public void printHello() {
        a.test();
    }
}