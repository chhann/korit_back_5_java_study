package com.study.honja.test0115;

class Factory {
    private String factoryName;
    private static Factory instance;

    private Factory() {};

    public static Factory getInstance() {
        if(instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "factoryName='" + factoryName + '\'' +
                '}';
    }
}
