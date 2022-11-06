package com.example.designpattern.strategy;

/**
 * function desc
 *
 * @author lauz
 * @since 2022/11/5
 */
public class King extends Character{
    @Override
    public void fight() {
        System.out.println("i am King");
        weaponBehavior.useWeapon();
    }
}
