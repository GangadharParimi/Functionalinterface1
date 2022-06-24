package com.example.functionalinterface;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapIteration {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("HI","HI");
        map.put("h","I");
        map.put("I","I");
        System.out.println(map.size());

        Map<Integer,String> stringMap=new HashMap<>();
        stringMap.put(23,"h");
        stringMap.put(11,"g");
        stringMap.put(12,"j");

        /*for(Map.Entry<String,String> entry: map.entrySet()){
            System.out.println("Key"+entry.getKey());
            System.out.println("Key"+entry.getValue());
        }
        map.entrySet().forEach(stringStringEntry -> {
            System.out.println("Key  "+stringStringEntry.getKey()+"  Value   "+stringStringEntry.getValue());
        });

        map.entrySet().stream().filter(stringStringEntry -> {
            return stringStringEntry.getKey().equals("HI");
        }).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue)).entrySet().forEach(stringStringEntry -> {
            System.out.println("Key  "+stringStringEntry.getKey()+"  Value   "+stringStringEntry.getValue());
        });*/
       /* stringMap.entrySet().stream().sorted((o1, o2) -> {
            return o1.getKey()- o2.getKey();
        }).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(a,b)->a,LinkedHashMap::new)).entrySet().
                forEach(stringStringEntry -> {
                    System.out.println("Key  "+stringStringEntry.getKey()+"  Value   "+stringStringEntry.getValue());
                });*/

        stringMap.entrySet().stream().
                sorted((o1,o2)->{
                    return (o1.getValue().compareTo(o2.getValue()));
                }).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(a, b)->a,LinkedHashMap::new)).entrySet().
                forEach(stringStringEntry -> {
                    System.out.println("Key  "+stringStringEntry.getKey()+"  Value   "+stringStringEntry.getValue());
                });
    }
}
