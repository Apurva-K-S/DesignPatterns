package com.example.DesignPatterns.Behavioural.State;

public class OrderShippedState implements State{
    @Override
    public void nextState(Order order) {
        order.setNextState(new OrderDeliveredState());
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Cant cancel order once it is in shipped state!");
    }

    @Override
    public void addItemsToOrder(Order order) {
        System.out.println("Cant add items to order once it is shipped");
    }

    @Override
    public void getStatus(Order order) {
        System.out.println("Currently order is in: " + order.getNextState().getName());
    }

    @Override
    public String getName() {
        return "Order Shipped State";
    }
}
