package com.example.threads.model;

public class Ping extends Thread {


    public void run() {

        Object a = new Object();

        synchronized (a) {
            for (int i = 0; i < 10; i++) {
                try {
                    getPing();
                    a.notify();
                    a.wait(500);

                } catch (Exception ex) {
                    ex.getMessage();
                }
            }
        }
    }

    public void getPing() {

        System.out.println("ping");
    }
}
