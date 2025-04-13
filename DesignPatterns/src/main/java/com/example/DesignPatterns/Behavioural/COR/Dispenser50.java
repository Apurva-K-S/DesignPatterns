package com.example.DesignPatterns.Behavioural.COR;

public class Dispenser50 implements Dispenser{
    private Dispenser nextDispenser;

    @Override
    public void dispenseAmount(Currency cur) {
        if(cur.getAmount() >= 50)
        {
            int notes = cur.getAmount() / 50;
            int remainingAmount = cur.getAmount() % 50;
            System.out.println("Dispensing " + notes + ", 50 notes");
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