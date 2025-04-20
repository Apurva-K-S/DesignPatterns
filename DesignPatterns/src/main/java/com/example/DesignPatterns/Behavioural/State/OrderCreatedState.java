package com.example.DesignPatterns.Behavioural.State;

public class OrderCreatedState implements State{

    @Override
    public void nextState(Order order) {
        order.setNextState(new OrderPaidState());
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order is cancelled! from OrderCreatedState");
    }

    @Override
    public void addItemsToOrder(Order order) {
        order.getItems().add("apple");
    }

    @Override
    public void getStatus(Order order) {
        System.out.println("currently order is in: "+order.getNextState().getName());
    }

    @Override
    public String getName() {
        return "Created State";
    }
}
