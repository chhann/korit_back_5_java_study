package com.study.ch07.iphone;

public class IphoneRepository {
    void saveIphone(IphoneCharcater iphoneCharcater){
        IphoneDB iphoneDB = new IphoneDB();

        iphoneDB.insertIphone(iphoneCharcater);
    };
}
