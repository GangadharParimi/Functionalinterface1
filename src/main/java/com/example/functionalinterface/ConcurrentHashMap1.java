package com.example.functionalinterface;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap1 {
    public static void main(String[] args) {
        ConcurrentHashMap<String,String> concurrentHashMap=new ConcurrentHashMap();
        concurrentHashMap.put("Hi","Hi");
        concurrentHashMap.put("Hii","Hii");
        concurrentHashMap.put("Hiii","Hiii");
        concurrentHashMap.put("Hiiii","Hiiii");

        concurrentHashMap.entrySet().stream().forEach(x->{
            System.out.println(x.getKey());
            System.out.println(x.getValue());
        });
    }
}
