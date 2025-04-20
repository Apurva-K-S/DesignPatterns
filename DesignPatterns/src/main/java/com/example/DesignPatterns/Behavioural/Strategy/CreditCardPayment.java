package com.example.DesignPatterns.Behavioural.Strategy;

public class CreditCardPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Paying via Creditcard");
    }
}
