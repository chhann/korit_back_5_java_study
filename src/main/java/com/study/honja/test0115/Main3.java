package com.study.honja.test0115;

public class Main3 {
    public static void main(String[] args) {
        Order order = null;
        if(order == null){
            order = new Order.OrderBuilder().build();
        }
        order.showOrderInfo();


    }
}
