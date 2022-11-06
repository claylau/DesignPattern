package com.example.designpattern.observer;


import java.util.ArrayList;
import java.util.List;

/**
 * function desc
 *
 * @author lauz
 * @since 2022/11/5
 */
public class WeatherData implements Subject {
    private List<Observer> observers;

    private String weatherMsg;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers) {
            o.update(weatherMsg);
        }
    }

    public void update(String msg) {
        this.weatherMsg = msg;
        notifyObserver();
    }
}
