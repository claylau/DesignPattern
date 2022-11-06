package com.example.designpattern.decorator;

/**
 * function desc
 *
 * @author lauz
 * @since 2022/11/6
 */
public abstract class Beverage {
    public String description = "unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
