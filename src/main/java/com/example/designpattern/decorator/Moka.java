package com.example.designpattern.decorator;

/**
 * function desc
 *
 * @author lauz
 * @since 2022/11/6
 */
public class Moka extends CondimentDecorator{
    Beverage beverage;

    public Moka(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
