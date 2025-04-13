package com.example.DesignPatterns;

import com.example.DesignPatterns.Creational.Singleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
		System.out.println("first => " + Singleton.getInstance());
		System.out.println("second => " + Singleton.getInstance());
	}

}
