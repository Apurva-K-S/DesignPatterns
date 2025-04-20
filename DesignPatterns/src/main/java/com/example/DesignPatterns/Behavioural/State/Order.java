package com.example.DesignPatterns.Behavioural.State;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<String> items;
    double totalCost;
    State nextState;

    public Order() {
        this.items = new ArrayList<>();
        this.totalCost = 0;
        this.nextState = new OrderCreatedState();
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public State getNextState() {
        return nextState;
    }

    public void setNextState(State nextState) {
        this.nextState = nextState;
    }

    public void nextState() {
        nextState.nextState(this);
    }

    public void getStatus() {
        nextState.getStatus(this);
    }

    public void cancel() {
        nextState.cancelOrder(this);
    }
}
