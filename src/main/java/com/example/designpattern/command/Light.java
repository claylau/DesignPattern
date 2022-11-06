package com.example.designpattern.command;

/**
 * function desc
 *
 * @author lauz
 * @since 2022/11/6
 */
public class Light {
    String name;

    public Light(String name) {
        this.name = name;
    }

    public void off() {
        System.out.println(this.name + "light off");
    }

    public void on() {
        System.out.println(this.name + "light on");
    }
}
