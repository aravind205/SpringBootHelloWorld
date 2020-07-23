package com.hello.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class MyRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("SPRING BOOT HELLO WORLD EXAMPLE...!");

	}

}
