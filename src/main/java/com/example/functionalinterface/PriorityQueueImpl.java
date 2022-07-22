package com.example.functionalinterface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueImpl {
    public static void main(String[] args) {
       /* PriorityQueue<EmployeeBean> employeeBeans=new PriorityQueue<>(Arrays.asList(
                (new EmployeeBean(1,"Gangadhar","Parimi",2000,"IT")),
                (new EmployeeBean(2,"Dha","Parimi",3000,"IT")),
                (new EmployeeBean(3,"sai","allam",4000,"Accounts")),
                (new EmployeeBean(4,"bha","kami",5000,"IT")),
                (new EmployeeBean(5,"babji","kolli",6000,"Account")),
                (new EmployeeBean(6,"bhi","kolla",2000,"IT")),
                (new EmployeeBean(7,"kiran","barre",8000,"Executive")),
                (new EmployeeBean(8,"jaya","nalla",9000,"IT")),
                (new EmployeeBean(9,"satti","chetta",1500,"Executive"))));
        employeeBeans.forEach(System.out::println);*/
        PriorityQueue<EmployeeBean> employeeBeans=new PriorityQueue<>(new ComparatorImpl());
        employeeBeans.addAll(Arrays.asList(
                (new EmployeeBean(1,"Gangadhar","Parimi",2000,"IT")),
                (new EmployeeBean(2,"Dha","Parimi",3000,"IT")),
                (new EmployeeBean(3,"sai","allam",4000,"Accounts")),
                (new EmployeeBean(4,"bha","kami",5000,"IT")),
                (new EmployeeBean(5,"babji","kolli",6000,"Account")),
                (new EmployeeBean(6,"bhi","kolla",2000,"IT")),
                (new EmployeeBean(7,"kiran","barre",8000,"Executive")),
                (new EmployeeBean(8,"jaya","nalla",9000,"IT")),
                (new EmployeeBean(9,"satti","chetta",1500,"Executive"))));
        employeeBeans.add(new EmployeeBean(10,"hhh","cccc",1800,"Executive"));
        employeeBeans.forEach(System.out::println);

        PriorityQueue<Integer> integers=new PriorityQueue<>();
        integers.add(6);
        integers.add(1);
        integers.add(2);
        integers.add(4);
        integers.add(9);
        integers.add(5);
        integers.forEach(System.out::println);


    }
}
