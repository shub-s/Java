package com.company;

class mythread extends Thread{
    @Override
    public void run() {
        System.out.println("------Thread Started--------");
        int[] a = {1,2,3,4,5,6,7,8,9};
        for (int i=0; i<a.length;i++){
            a[i] = a[i]*2;
            System.out.println(a[i]);
        }
        System.out.println("------Thread Shutdown--------");
    }
}

public class Main {

    public static void main(String[] args) {
        mythread t1 = new mythread();
        t1.start();
        System.out.println("-----Application Started--------");
        for (int i =0; i<10; i++){
            System.out.println("This is main class "+i);
        }
        System.out.println("-----Application Shutdown--------");
    }
}
