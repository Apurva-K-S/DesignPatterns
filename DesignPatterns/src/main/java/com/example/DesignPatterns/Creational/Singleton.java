package com.example.DesignPatterns.Creational;

public class Singleton {
    //Private static variable of the same class that is the only instance of the class.
    private static Singleton instance;

    //Private constructor to restrict instantiation of the class from other classes.
    private Singleton(){}

    //Public static method that returns the instance of the class, this is the global access point for the outer world to get the instance of the singleton class.
    //synchronized so that only one thread can execute this method at a time.
    public static synchronized Singleton getInstance(){
        if(instance==null)
        {
            instance = new Singleton();
        }
        return instance;
    }
}
