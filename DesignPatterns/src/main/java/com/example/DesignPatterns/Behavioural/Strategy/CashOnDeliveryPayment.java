package com.example.DesignPatterns.Behavioural.Strategy;

public class CashOnDeliveryPayment implements Payment{

    @Override
    public void pay() {
        System.out.println("Paying via Cash On Delivery");
    }
}
