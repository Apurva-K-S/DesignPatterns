package com.example.DesignPatterns.Behavioural.COR;

public interface Dispenser {
    void dispenseAmount(Currency cur);
    void setNextDispenser(Dispenser dispenser);
}
