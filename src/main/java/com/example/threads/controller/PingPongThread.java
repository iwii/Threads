package com.example.threads.controller;

import com.example.threads.model.Ping;
import com.example.threads.model.Pong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//public class PingPongThread implements Runnable {
public class PingPongThread extends Thread{


    @RequestMapping(value = "/pingPong", method = RequestMethod.GET)
    public String pingPongRun() {

        String result;
        try {
            run();
            result = "PingPong";
            return result;
        } catch (Exception ex) {
            result = ex.getMessage();
        }
        return result;
    }

    @Override
    public void run() {
        Ping ping = new Ping();
        Pong pong = new Pong();

        ping.start();
        pong.start();
    }
}