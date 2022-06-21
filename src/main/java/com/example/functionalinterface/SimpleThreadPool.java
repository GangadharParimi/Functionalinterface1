package com.example.functionalinterface;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Tasks implements Runnable{
    private String message;
    public Tasks(String s){
    this.message=s;
}
    @Override
    public void run() {
        try{
            for(int j=0;j<5;j++){
                if(j==0){
                    Date dt=new Date();
                    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Intialization of Task Name "+message+" "+simpleDateFormat.format(dt));
                }else{
                    Date dt = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss");

                    // prints the execution time for every task
                    System.out.println("Time of execution for the task name: " + message + " = " +sdf.format(dt));

                }
                Thread.sleep(2000);
            }
            System.out.println(message + " is complete.");

        }catch (Exception e){

        }
    }
}

public class SimpleThreadPool{
    static final int MAX_H=5;
    public static void main(String[] args) {
        Runnable r1=new Tasks("Task 1");
        Runnable r2=new Tasks("Task 2");
        Runnable r3=new Tasks("Task 3");
        Runnable r4=new Tasks("Task 4");
        Runnable r5=new Tasks("Task 5");

        ExecutorService executorService= Executors.newFixedThreadPool(MAX_H);
        executorService.execute(r1);
        executorService.execute(r2);
        executorService.execute(r3);
        executorService.execute(r4);
        executorService.execute(r5);
        executorService.shutdown();

    }
}