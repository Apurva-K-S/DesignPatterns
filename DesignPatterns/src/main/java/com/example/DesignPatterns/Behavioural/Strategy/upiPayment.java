package com.example.DesignPatterns.Behavioural.Strategy;

public class upiPayment implements Payment{

    @Override
    public void pay() {
        System.out.println("Paying via UPI");
    }
}
