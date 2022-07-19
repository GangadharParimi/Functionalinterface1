package com.example.functionalinterface;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class StringDupWords {
    public static void main(String[] args) {
        String word="hi hi hi hi boy girl";
        String[] words= word.split(" ");
        List<String> list=new ArrayList<>();
        for (String x:words){
            list.add(x);
        }
        System.out.println(list);

        ConcurrentHashMap<String,Integer> count=new ConcurrentHashMap<>();
        for (String s:list){
            if(count.containsKey(s)){
                count.put(s,count.get(s)+1);

            }else{
                count.put(s,1);
            }
        }
        System.out.println(count);
    }


}
