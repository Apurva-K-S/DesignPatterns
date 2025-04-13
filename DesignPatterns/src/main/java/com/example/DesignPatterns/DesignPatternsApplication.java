package com.example.DesignPatterns;

import com.example.DesignPatterns.Behavioural.COR.ATMDispenser;
import com.example.DesignPatterns.Creational.Factory.Animal;
import com.example.DesignPatterns.Creational.Factory.BalancedAnimalFactory;
import com.example.DesignPatterns.Creational.Factory.RandomAnimalFactory;
import com.example.DesignPatterns.Creational.Singleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
		/*
		// Singleton usage
		System.out.println("first => " + Singleton.getInstance());
		System.out.println("second => " + Singleton.getInstance());

		// factory usage.
		RandomAnimalFactory randomAnimalFactory = new RandomAnimalFactory();
		System.out.println("Random Animal Factory output: ");
		for(int i=0;i<5;i++)
		{
			Animal animal = randomAnimalFactory.createAnimal();
			animal.speak();
		}

		BalancedAnimalFactory balancedAnimalFactory = new BalancedAnimalFactory();
		System.out.println("Balanced Animal Factory output: ");
		for(int i=0;i<5;i++)
		{
			Animal animal = balancedAnimalFactory.createAnimal();
			animal.speak();
		}
		*/
		// Chain of Responsibility usage.
		ATMDispenser dispenser = new ATMDispenser();
		dispenser.getAmountFromAtm();
	}

}
