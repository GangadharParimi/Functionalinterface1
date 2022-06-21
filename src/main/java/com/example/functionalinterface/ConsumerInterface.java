package com.example.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    static  void addSumList(List<Integer> integerList){
        int result=integerList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum"+result);
    }

    public static void main(String[] args) {
        List<Integer>integers=new ArrayList<>();
        integers.add(10);
        integers.add(20);
        Consumer<List<Integer>> listConsumer=ConsumerInterface::addSumList;
        listConsumer.accept(integers);
    }
}
