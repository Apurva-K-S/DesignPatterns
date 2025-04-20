package com.example.DesignPatterns.Behavioural.State;

public interface State {
    public void nextState(Order order);
    public void cancelOrder(Order order);
    public void addItemsToOrder(Order order);
    public void getStatus(Order order);
    public String getName();
}
