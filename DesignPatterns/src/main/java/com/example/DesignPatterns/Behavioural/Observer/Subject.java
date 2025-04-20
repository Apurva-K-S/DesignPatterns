package com.example.DesignPatterns.Behavioural.Observer;

public interface Subject {
    public void register(Observer observer);
    public void unregister(Observer observer);
    public void notifyObservers();
    public Object getUpdate();
}
