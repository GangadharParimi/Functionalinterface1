package com.example.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionInterface {
    static Integer addSum(List<Integer> integerList){
        return integerList.stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
        List<Integer>integers=new ArrayList<>();
        integers.add(10);
        integers.add(20);
        Function<List<Integer>,Integer>listIntegerFunction=FunctionInterface::addSum;
        System.out.println(listIntegerFunction.apply(integers));
    }
}
