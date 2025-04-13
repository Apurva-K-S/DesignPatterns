package com.example.DesignPatterns.Creational.Factory;

public class BalancedAnimalFactory implements AnimalFactory{

    private int count=0;

    @Override
    public Animal createAnimal() {
        count = (count+1)%3;
        return switch (count){
            case 0 -> new Dog();
            case 1 -> new Cat();
            case 2 -> new Duck();
            default -> null;
        };
    }
}
