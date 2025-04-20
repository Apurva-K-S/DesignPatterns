package com.example.DesignPatterns.Behavioural.State;

public class OrderCancelledState implements State{
    @Override
    public void nextState(Order order) {
        order.setNextState(null);
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Not possible to cancel a cancelled order");
    }

    @Override
    public void addItemsToOrder(Order order) {
        System.out.println("Not possible to add items to cancelled order");
    }

    @Override
    public void getStatus(Order order) {
        System.out.println("Currently order is in: " + order.getNextState().getName());
    }

    @Override
    public String getName() {
        return "Order Cancelled State";
    }
}
