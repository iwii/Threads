package com.example.threads.model;

public class Pong extends Thread {

    String text = "pong";

    public void run() {

        Object a = new Object();

        synchronized (a) {
            for (int i = 0; i < 10; i++) {
                try {
                    getPong();
                    a.notify();
                    a.wait(500);
                } catch (Exception ex) {
                    ex.getMessage();
                }
            }
        }
    }

    public void getPong() {

      System.out.println("pong");
    }
}
