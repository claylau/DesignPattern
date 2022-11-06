package com.example.designpattern.observer;

/**
 * function desc
 *
 * @author lauz
 * @since 2022/11/5
 */
public interface Subject {
    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
