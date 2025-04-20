package com.example.DesignPatterns.Behavioural.Strategy;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Item> itemList;

    public Cart() {
        this.itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void removeItem(Item item){
        itemList.remove(item);
    }

    public double getTotalCost(){
        double totalCost=0;
        for(Item item: itemList){
            totalCost += item.getPrice();
        }
        return totalCost;
    }

    public void pay(Payment payment){
        payment.pay();
    }
}
