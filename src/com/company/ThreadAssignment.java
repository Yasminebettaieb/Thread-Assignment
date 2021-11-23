package com.company;

public class ThreadAssignment {

    static class Counter {
        public synchronized void count() {

            for (int i = 350; i >= 1; i--) {
                System.out.println(i);
                if (i == 1) {
                    System.out.println("FINISH!");

                }
            }
        }}

        static class MyThread extends Thread {
            private final Counter counter;

            public MyThread(Counter counter) {
                this.counter = counter;
            }

            @Override
            public void run() {
                counter.count();
            }
        }

        public static void main(String[] args) throws InterruptedException {
            Counter counter = new Counter();

            Thread t1 = new MyThread(counter);
            t1.start();

            Thread t2 =new MyThread(counter);
            t2.start();

            /*wait till two threads die*/
            t1.join();
            t2.join();
            /*when two thread are dead then print DONE! */
                System.out.println("DONE !");


        }
    }
