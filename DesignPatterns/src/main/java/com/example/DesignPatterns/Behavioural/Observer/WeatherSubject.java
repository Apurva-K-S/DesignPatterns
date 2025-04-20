package com.example.DesignPatterns.Behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject implements Subject{
    List<Observer> observerList;
    double temperature;

    public WeatherSubject() {
        observerList = new ArrayList<>();
        temperature = 0;
    }

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        int index = 0;
        for(int i=0;i<observerList.size();i++)
        {
            if(observerList.get(i)==observer)
                index=i;
        }

        Observer lastObserver = observerList.get(observerList.size()-1);
        Observer temp = observerList.get(index);
        observerList.set(observerList.size()-1, temp);
        observerList.set(index, lastObserver);
        observerList.remove(observerList.size()-1);
    }

    @Override
    public void notifyObservers() {
        for(Observer o: observerList)
        {
            o.update();
        }
    }

    public void setTemperature(double temperature){
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public Object getUpdate() {
        return this.temperature;
    }
}
