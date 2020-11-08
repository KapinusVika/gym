package com.java.automation.lab.fall.kapinus.core22.domain;

class Booking {

    synchronized void book(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}

     class BookingThread implements Runnable {
        String msg;
        Booking booking;
        Thread b;

        public BookingThread(Booking booking, String msg) {
            this.msg = msg;
            this.booking = booking;
            this.b = new Thread(this);
            this.b.start();
        }

        @Override
        public void run() {

            booking.book(msg);
        }

    public static void main(String[] args) {
        Booking booking = new Booking();
        BookingThread cl = new BookingThread(booking, "Client 1 finished booking");
        BookingThread c2 = new BookingThread(booking, "Client 2 finished booking");

        try {
            cl.b.join();
            c2.b.join();
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }




