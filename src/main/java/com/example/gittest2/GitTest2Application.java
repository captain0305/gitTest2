package com.example.gittest2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTest2Application {

	public static void main(String[] args) {
		SpringApplication.run(GitTest2Application.class, args);
		System.out.println("main fist commit");
		System.out.println("hot-fix first");
		System.out.println("push test");
		System.out.println("pull test");
	}

}
