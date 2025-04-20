package com.example.DesignPatterns.Behavioural.Observer;

public class AajTakNewsObserver implements Observer{
    double temperature;
    Subject subject;
    @Override
    public void update() {
        temperature = (double) subject.getUpdate();
        System.out.println("WEATHER UPDATE FROM AAJTAK NEWS!");
        System.out.println("Current temperature is "+ temperature);
        System.out.println("============================\n");
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
