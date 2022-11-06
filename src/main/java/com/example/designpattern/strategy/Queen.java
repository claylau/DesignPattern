package com.example.designpattern.strategy;

/**
 * function desc
 *
 * @author lauz
 * @since 2022/11/5
 */
public class Queen extends Character{
    @Override
    public void fight() {
        System.out.println("i am Queen");
        weaponBehavior.useWeapon();
    }
}
