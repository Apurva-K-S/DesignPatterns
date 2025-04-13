package com.example.DesignPatterns.Behavioural.COR;

public class Dispenser500 implements Dispenser{
    private Dispenser nextDispenser;

    @Override
    public void dispenseAmount(Currency cur) {
        if(cur.getAmount() >= 500)
        {
            int notes = cur.getAmount() / 500;
            int remainingAmount = cur.getAmount() % 500;
            System.out.println("Dispensing " + notes + ", 500 notes");
            System.out.println("Remaining amount = " + remainingAmount);
            if(remainingAmount!=0)
                this.nextDispenser.dispenseAmount(new Currency(remainingAmount));
        }
    }

    @Override
    public void setNextDispenser(Dispenser dispenser) {
        this.nextDispenser = dispenser;
    }
}