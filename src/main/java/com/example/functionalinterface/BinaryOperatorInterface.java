package com.example.functionalinterface;

import java.util.function.BinaryOperator;

public class BinaryOperatorInterface {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator=BinaryOperator.maxBy((a,b)->a>b?1:((a==b)?0:-1));
        System.out.println(binaryOperator.apply(5,5));
    }

}
