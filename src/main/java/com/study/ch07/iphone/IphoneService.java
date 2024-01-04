package com.study.ch07.iphone;

import com.study.ch07.register.Product;

public class IphoneService {

    boolean isEmptyString(String str){
        if(str == null){
            return true;
        }
        return str.isBlank();
    }

    void registerProductService(IphoneCharcater iphoneCharcater) {
        IphoneRepository iphoneRepository = new IphoneRepository();

        iphoneRepository.saveIphone(iphoneCharcater);
    }



}
