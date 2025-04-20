package com.example.DesignPatterns.Behavioural.State;

public class OrderPaidState implements State{
    @Override
    public void nextState(Order order) {
        order.setNextState(new OrderShippedState());
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order cancelled! from OrderPaid State");
    }

    @Override
    public void addItemsToOrder(Order order) {
        System.out.println("not possible to add items once order is paid");
    }

    @Override
    public void getStatus(Order order) {
        System.out.println("currently order is in: " + order.getNextState().getName());
    }

    @Override
    public String getName() {
        return "Order Paid State";
    }
}
