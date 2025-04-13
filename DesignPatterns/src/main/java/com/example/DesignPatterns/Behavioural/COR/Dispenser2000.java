package com.example.DesignPatterns.Behavioural.COR;

public class Dispenser2000 implements Dispenser{
    private Dispenser nextDispenser;

    @Override
    public void dispenseAmount(Currency cur) {
        if(cur.getAmount() >= 2000)
        {
            int notes = cur.getAmount() / 2000;
            int remainingAmount = cur.getAmount() % 2000;
            System.out.println("Dispensing " + notes + ", 2000 notes");
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
