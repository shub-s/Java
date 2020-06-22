package com.company;

class Counter{
    int count;
    // synchronized keyword is used to allow only one thread to complete the execution at the same time
    // This can remove concurrency between Thread and allow the thread to process to execute.
    public synchronized void increment(){
        count++;
    }
}

public class Main {

    public static void main(String[] args) throws Exception {
        Counter c = new Counter();

        Thread t1 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                            for (int i=0; i<1000; i++){
                                c.increment();
                            }
                        }
                }
        );

        // Start the Thread
        t1.start();
        //Complete The Thread process before executing main process
        t1.join();
        //Print The value for the Count in Counter class
        System.out.println("Counter #"+c.count);
    }
}
