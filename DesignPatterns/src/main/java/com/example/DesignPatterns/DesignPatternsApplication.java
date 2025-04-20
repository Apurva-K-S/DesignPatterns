package com.example.DesignPatterns;

import com.example.DesignPatterns.Behavioural.COR.ATMDispenser;
import com.example.DesignPatterns.Behavioural.Observer.AajTakNewsObserver;
import com.example.DesignPatterns.Behavioural.Observer.Subject;
import com.example.DesignPatterns.Behavioural.Observer.WeatherSubject;
import com.example.DesignPatterns.Behavioural.State.Order;
import com.example.DesignPatterns.Behavioural.Strategy.*;
import com.example.DesignPatterns.Creational.Factory.Animal;
import com.example.DesignPatterns.Creational.Factory.BalancedAnimalFactory;
import com.example.DesignPatterns.Creational.Factory.RandomAnimalFactory;
import com.example.DesignPatterns.Creational.Singleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Scanner;

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

		// Chain of Responsibility usage.
		ATMDispenser dispenser = new ATMDispenser();
		dispenser.getAmountFromAtm();


		// Observer Pattern
		WeatherSubject weatherSubject = new WeatherSubject();
		AajTakNewsObserver aajTakNewsObserver = new AajTakNewsObserver();

		weatherSubject.register(aajTakNewsObserver);
		aajTakNewsObserver.setSubject(weatherSubject);


		while(true) {
			System.out.print("Enter current temperature in bangalore in Celcius: ");
			Scanner sc = new Scanner(System.in);
			double temperature = sc.nextDouble();
			weatherSubject.setTemperature(temperature);
		}

		// Strategy pattern
		Item item1 = new Item("Lays", 10);
		Item item2 = new Item("kurkure", 20);
		Item item3 = new Item("Too yumm!", 20);
		Cart cart = new Cart();
		cart.addItem(item1);
		cart.addItem(item2);
		cart.addItem(item3);

		cart.pay(new CreditCardPayment());
		cart.pay(new upiPayment());
		cart.pay(new CashOnDeliveryPayment());

		 */
		// State Pattern
		Order order = new Order();
		ArrayList<String> items = new ArrayList<>();
		items.add("Mango");
		items.add("Kiwi");
		order.setItems(items);
		order.getStatus();
		order.nextState(); // pay
		order.getStatus();
		order.nextState(); // ship
		order.getStatus();
		order.nextState(); // cancel after shipping — not allowed
		order.getStatus();
		order.nextState(); // deliver
		order.getStatus();
		order.cancel();
	}
}
