package com.example.functionalinterface;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
    List<EmployeeBean> list =new ArrayList<EmployeeBean>(Arrays.asList(
        (new EmployeeBean(1,"Gangadhar","Parimi",2000,"IT")),
        (new EmployeeBean(2,"Dha","Parimi",3000,"IT")),
        (new EmployeeBean(3,"sai","allam",4000,"Accounts")),
        (new EmployeeBean(4,"bha","kami",5000,"IT")),
        (new EmployeeBean(5,"babji","kolli",6000,"Account")),
        (new EmployeeBean(6,"bhi","kolla",2000,"IT")),
        (new EmployeeBean(7,"kiran","barre",8000,"Executive")),
        (new EmployeeBean(8,"jaya","nalla",9000,"IT")),
        (new EmployeeBean(9,"satti","chetta",1500,"Executive"))));

    Map<String,List<EmployeeBean>> map=list.stream().collect(Collectors.groupingBy(EmployeeBean::getEmpDept,Collectors.toList()));
        /*for (Map.Entry<String, List<EmployeeBean>> listEntry : map.entrySet()) {
            System.out.println("Dept Name :" + listEntry.getKey() + "  Employess are" + listEntry.getValue());
        }*/
        Map<String,List<EmployeeBean>> map1=   map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).
                            collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(a,b)->a,LinkedHashMap::new));
        map1.entrySet().forEach(stringListEntry -> {
            System.out.println("Dept Name :"+stringListEntry.getKey()+"  Employess are"+stringListEntry.getValue());
        });
/*
       Map<String,Long>dupmap= list.stream().collect(Collectors.groupingBy(EmployeeBean::getEmpDept
               ,Collectors.counting()));

       List<String> strings=list.stream().map(emp->emp.getEmpDept()).collect(Collectors.toList());
       Set<String> unique=new HashSet<>();
     Set<String> dupset=  strings.stream().filter(emp->!unique.add(emp)).collect(Collectors.toSet());
        System.out.println(dupset);*/
        /*dupmap. entrySet().forEach(stringLongEntry -> {
                   System.out.println(stringLongEntry.getKey());
                   System.out.println(stringLongEntry.getValue());
               });*/
       /* Set<String> strings=dupmap.entrySet().stream().filter(stringLongEntry -> stringLongEntry.getValue()>1).map(entry->entry.getKey()).collect(Collectors.toSet());
        System.out.println(strings);*/
      /*  Map<Double,List<EmployeeBean>> stringMap=list.stream().
                collect(Collectors.groupingBy(EmployeeBean::getEmpSal,Collectors.toList()));

       *//* stringMap.entrySet().forEach(doubleListEntry -> {
            System.out.println("Key"+doubleListEntry.getKey());
            System.out.println("Value"+doubleListEntry.getValue());
        });*//*
*//*
        System.out.println(  list.stream().max(Comparator.comparing(EmployeeBean::getEmpSal)).get());
        System.out.println(  list.stream().max(((o1, o2) -> o1.getEmpSal()>o2.getEmpSal()?1:-1)).get());*//*

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
        }).collect(Collectors.toList()).forEach(System.out::println);*/
    }
}
