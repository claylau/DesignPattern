package com.example.designpattern.factory;

/**
 * function desc
 *
 * @author lauz
 * @since 2022/11/6
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("I ordered a "+ pizza.getName() + "\n");
    }
}
