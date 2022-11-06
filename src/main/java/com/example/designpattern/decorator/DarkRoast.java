package com.example.designpattern.decorator;

/**
 * function desc
 *
 * @author lauz
 * @since 2022/11/6
 */
public class DarkRoast extends Beverage{
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
