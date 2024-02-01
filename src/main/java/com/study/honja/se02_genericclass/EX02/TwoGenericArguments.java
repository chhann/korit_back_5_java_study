package com.study.honja.se02_genericclass.EX02;

class KeyValue<K, V> {
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

public class TwoGenericArguments {
    public static void main(String[] args) {
        KeyValue<String, Integer> Kv1 = new KeyValue<>();
        Kv1.setKey("사과");
        Kv1.setValue(1000);
        String key1 = Kv1.getKey();
        int value1 = Kv1.getValue();
        System.out.println("Key:"+ key1 +"value:" + value1);

        KeyValue<Integer, String> Kv2 = new KeyValue<>();
        Kv2.setKey(404);
        Kv2.setValue("Not Fount(요청한 페이지를 찾을 수 없습니다.)");
        int key2 = Kv2.getKey();
        String value2 = Kv2.getValue();
        System.out.println("Key:"+ key2 +"value:" + value2);

        KeyValue<String, Void> Kv3 = new KeyValue<>();
        Kv3.setKey("키값만 사용");
        String key3 = Kv3.getKey();
        System.out.println("key:" + key3);
    }
}
