package com.example.DesignPatterns.Creational.Factory;

import java.util.Random;

public class RandomAnimalFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        Random r = new Random();
        int choice = 1+r.nextInt(3);
        return switch (choice) {
            case 1 -> new Dog();
            case 2 -> new Cat();
            case 3 -> new Duck();
            default -> null;
        };
    }
}
