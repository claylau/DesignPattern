package com.example.designpattern.factory;

/**
 * function desc
 *
 * @author lauz
 * @since 2022/11/6
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else {
            return null;
        }
    }
}
