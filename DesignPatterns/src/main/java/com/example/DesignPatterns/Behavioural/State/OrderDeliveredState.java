package com.example.DesignPatterns.Behavioural.State;

public class OrderDeliveredState implements State{

    @Override
    public void nextState(Order order) {
        order.setNextState(new OrderDeliveredState());
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Cant cancel order once it is delivered");
    }

    @Override
    public void addItemsToOrder(Order order) {
        System.out.println("Cant add items to order as it is delivered");
    }

    @Override
    public void getStatus(Order order) {
        System.out.println("currently order is in: "+order.getNextState().getName());
    }

    @Override
    public String getName() {
        return "Order Delivered State";
    }
}
