package com.study.honja.ch19BrushUp;

import lombok.ToString;

@ToString
public class Phone {
    private String model;
    private int version;

    public Phone(String model, int version) {
        this.model = model;
        this.version = version;
    }

    public static PhoneBuilder builder() {
        return new PhoneBuilder();
    }

    public static class PhoneBuilder {
        private String model;
        private int version;

        public Phone build(){
            return new Phone(model, version);
        }


        public PhoneBuilder model(String model) {
            this. model = model;
            return this;
        }
        public PhoneBuilder version(Integer version) {
            this. version = version;
            return this;
        }

    }




}
