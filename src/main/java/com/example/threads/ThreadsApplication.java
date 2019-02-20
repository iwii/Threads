package com.example.threads;

import com.example.threads.controller.PingPongThread;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.threads")
public class ThreadsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThreadsApplication.class, args);
	}

}

