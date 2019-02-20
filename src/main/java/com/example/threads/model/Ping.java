package com.example.threads.model;

public class Ping extends Thread {

    String text = "ping";

    public void run() {

        Object a = new Object();

        synchronized (a) {
            for (int i = 0; i < 10; i++) {
                try {
                    System.out.println(text);
                    a.notify();
                    a.wait(500);

                } catch (Exception ex) {
                    ex.getMessage();
                }
            }
        }
    }
}
