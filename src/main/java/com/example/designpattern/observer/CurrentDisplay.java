package com.example.designpattern.observer;

/**
 * function desc
 *
 * @author lauz
 * @since 2022/11/5
 */
public class CurrentDisplay implements Observer{
    private String msg;
    private Subject subject;

    public CurrentDisplay(Subject s) {
        subject = s;
        subject.addObserver(this);
    }

    @Override
    public void update(String msg) {
        this.msg = msg;
        System.out.println(msg);
    }
}
