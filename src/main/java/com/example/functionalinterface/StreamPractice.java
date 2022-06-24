package com.example.functionalinterface;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
    List<EmployeeBean> list =new ArrayList<EmployeeBean>(Arrays.asList(
        (new EmployeeBean(1,"Gangadhar","Parimi",2000,"IT")),
        (new EmployeeBean(2,"Dha","Parimi",3000,"IT")),
        (new EmployeeBean(3,"sai","allam",4000,"Accounts")),
        (new EmployeeBean(4,"bha","kami",5000,"IT")),
        (new EmployeeBean(5,"babji","kolli",6000,"Accounts")),
        (new EmployeeBean(6,"bhi","kolla",2000,"IT")),
        (new EmployeeBean(7,"kiran","barre",8000,"Executive")),
        (new EmployeeBean(8,"jaya","nalla",9000,"IT")),
        (new EmployeeBean(9,"satti","chetta",1500,"Executive"))));



        Map<Double,List<EmployeeBean>> stringMap=list.stream().
                collect(Collectors.groupingBy(EmployeeBean::getEmpSal,Collectors.toList()));

       /* stringMap.entrySet().forEach(doubleListEntry -> {
            System.out.println("Key"+doubleListEntry.getKey());
            System.out.println("Value"+doubleListEntry.getValue());
        });*/
/*
        System.out.println(  list.stream().max(Comparator.comparing(EmployeeBean::getEmpSal)).get());
        System.out.println(  list.stream().max(((o1, o2) -> o1.getEmpSal()>o2.getEmpSal()?1:-1)).get());*/

       Map<String, Optional<EmployeeBean>> map= list.stream().collect(Collectors.groupingBy(EmployeeBean::getEmpDept,Collectors.reducing(
                BinaryOperator.maxBy(Comparator.comparing(EmployeeBean::getEmpSal))
        )));
        map.entrySet().forEach(doubleListEntry -> {
            System.out.println("Key"+doubleListEntry.getKey());
            System.out.println("Value"+doubleListEntry.getValue());
        });

        list.stream().map(e->{
         if(e.getEmpSal()<5000){
             e.setEmpSal(e.getEmpSal()*100);
         }return e;
        }).collect(Collectors.toList()).forEach(System.out::println);
    }
}
