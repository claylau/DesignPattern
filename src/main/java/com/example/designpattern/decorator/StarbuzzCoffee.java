package com.example.designpattern.decorator;

/**
 * function desc
 *
 * @author lauz
 * @since 2022/11/6
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        Beverage beverage1 = new Moka(beverage);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
    }
}
