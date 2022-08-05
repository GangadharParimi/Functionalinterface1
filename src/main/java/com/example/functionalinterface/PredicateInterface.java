package com.example.functionalinterface;

import java.util.function.Predicate;

public class PredicateInterface {

     static Boolean checkAge(int age){
        if(age>15) return true;
        else return false;
    }
    public static void main(String[] args) {
    Predicate<Integer> predicate=PredicateInterface::checkAge;
        System.out.println(predicate.test(17));
    }
}
