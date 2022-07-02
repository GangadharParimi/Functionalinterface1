package com.example.functionalinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class StringCharacterCount {

    public static void main(String[] args) {

        String name = "  gangadhar";
        char[] namechar = name.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map1 = new HashMap<>();
        for (char c : namechar) {
            if (Character.isAlphabetic(c)) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);

                } else {
                    map.put(c, 1);
                }
            }
        }
        System.out.println(map);
        for (int i = 0; i < name.length(); i++) {
            if(Character.isAlphabetic(name.charAt(i))) {
            if (map1.containsKey(name.charAt(i))) {
                map1.put(name.charAt(i), map1.get(name.charAt(i)) + 1);
            } else {
                map1.put(name.charAt(i), 1);
            }
            }
        }
        System.out.println(map1);
    }



}
