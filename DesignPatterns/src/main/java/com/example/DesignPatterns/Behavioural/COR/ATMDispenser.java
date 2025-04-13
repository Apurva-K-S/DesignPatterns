package com.example.DesignPatterns.Behavioural.COR;

import java.util.Scanner;

public class ATMDispenser {
    private Dispenser dispenser;
    Scanner sc = new Scanner(System.in);

    public ATMDispenser() {
        this.dispenser = new Dispenser2000();
        Dispenser dispenser500 = new Dispenser500();
        Dispenser dispenser200 = new Dispenser200();
        Dispenser dispenser100 = new Dispenser100();
        Dispenser dispenser50 = new Dispenser50();

        this.dispenser.setNextDispenser(dispenser500);
        dispenser500.setNextDispenser(dispenser200);
        dispenser200.setNextDispenser(dispenser100);
        dispenser100.setNextDispenser(dispenser50);
    }

    public void getAmountFromAtm() {
        while(true)
        {
            System.out.print("Please enter the amount in multiples of 50: ");
            int amount=sc.nextInt();
            dispenser.dispenseAmount(new Currency(amount));
            System.out.print("do you want to withdraw anything more, Y/N: ");
            String value = sc.next();
            if(value.equals("N"))
                break;
        }
    }
}
