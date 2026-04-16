package com.Multithreading;

public class Threadmethod2 extends  Thread{
    public void run(){
        for (int i=0;i<=50;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Threadmethod2 t2 = new Threadmethod2();
        t2.start();
    }
}

