package com.dnd.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.dnd")
public class TestMain {

	public static void main(String[] args) {

		SpringApplication.run(TestMain.class, args);
	}

}
