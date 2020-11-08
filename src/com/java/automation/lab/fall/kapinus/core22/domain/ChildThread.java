package com.java.automation.lab.fall.kapinus.core22.domain;

import java.util.PrimitiveIterator;
import java.util.stream.IntStream;

class ChildThread extends Thread {
//    public ChildThread() {
//        this("Child");
//    }
//
//    public ChildThread(String name) {
//        super(name);
//    }
//
//    @Override
//    public void run() {
//        IntStream s = IntStream.range(1, 10);
//        PrimitiveIterator.OfInt it = s.iterator();
//        while (it.hasNext()) {
//            try {
//                System.out.println(this.getName() + it.next());
//                Thread.sleep(5);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println("Child thread has finished");
//
//    }

    static class Callme {

        synchronized void call(String msg) {
            System.out.print("[" + msg);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
            System.out.println("]");
        }
    }

    static class Caller implements Runnable {
        String msg;
        Callme target;
        Thread t;

        public Caller(Callme trg, String msg) {
            this.msg = msg;
            this.target = trg;
            this.t = new Thread(this);
            this.t.start();
        }

        @Override
        public void run() {
            target.call(msg);
        }
    }



    public static void main(String[] args) {
        /*Basics*/
//        Thread a = new ChildThread();
//        Thread b = new ChildThread("Child2");
//        Thread c = new ChildThread("Child3");
//
//        a.start();
//        b.start();
//        c.start();
//
//        try {
//            for (int i = 0; i < 10; i++) {
//
//                System.out.println("Main" + i);
//                Thread.sleep(5);
//            }
////
////            a.join();
////            b.join();
////            c.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Main thread has finished");


        Callme target = new Callme();
        Caller o1 = new Caller(target, "Welcome");
        Caller o2 = new Caller(target, "to");
        Caller o3 = new Caller(target, "synchronized world!");

        try {
            o1.t.join();
            o2.t.join();
            o3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}