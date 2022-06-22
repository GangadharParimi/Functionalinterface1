package com.example.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionInterface {
    static Integer addSum(int a ,int b){
        return a+b;
    }

    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> addSum=BiFunctionInterface::addSum;
        Function<Integer,Integer>function=(c)->c/2;
        System.out.println(addSum.andThen(function).apply(20,30));
        System.out.println(addSum.andThen(function).apply(50,70));
    }
}
