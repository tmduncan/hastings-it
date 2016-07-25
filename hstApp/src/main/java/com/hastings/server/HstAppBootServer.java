package com.hastings.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HstAppBootServer {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(new Class[]{HstAppBootServer.class}, args);
	}
}