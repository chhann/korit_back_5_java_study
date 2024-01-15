package com.study.honja.test0115;

class Order {
    private int orderId;
    private String productName;
    private String consumerName;
    private int price;
    private int stock;

    public void showOrderInfo() {
        System.out.println("주문번호: " + orderId);
        System.out.println("상품명: " + productName);
        System.out.println("구매자: " + consumerName);
        System.out.println("가격: " + price);
        System.out.println("수량: " + stock);
    }

    public Order(int orderId,String productName, String consumerName,int price, int stock) {
        this.orderId = orderId;
        this.productName = productName;
        this.consumerName = consumerName;
        this.price = price;
        this.stock = stock;
    }


    public static class OrderBuilder {
        private int orderId = 100;
        private String productName= "Samsung GalaxyBook2 Pro";
        private String consumerName= "홍길동";
        private int price= 1450000;
        private int stock= 2;

        public Order build() {
            return new Order(orderId, productName, consumerName,price,stock);
        }

    }

}

