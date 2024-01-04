package com.study.ch07.register;

public class ProductService {

    boolean isEmptyString(String str) {
        if(str == null) {
            return true;
        }
        // isBlank() -> space를 다 지우고나서 공백인지를 확인 -> 비어있으면 true
        return str.isBlank();
    }

    void registerProductService(Product product){
        ProductRepository productRepository = new ProductRepository();

        System.out.println("서비스 까지 데이터 전달함.");

        productRepository.saveProduct(product);
    }










}
