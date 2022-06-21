package com.example.functionalinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerInterface {
    static void getMapDetails(Map<Integer,String> map, String name){
        System.out.println("----"+name+"Records-------");
        map.forEach((key,value)-> System.out.println(key+"------"+value));
    }

    public static void main(String[] args) {
        Map<Integer,String>stringMap=new HashMap<>();
        stringMap.put(100,"Ramu");
        stringMap.put(101,"Gan");
        BiConsumer<Map<Integer,String>,String>biConsumer=BiConsumerInterface::getMapDetails;
        biConsumer.accept(stringMap,"Student");

    }
}
