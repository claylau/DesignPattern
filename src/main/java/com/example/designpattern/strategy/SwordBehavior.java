package com.example.designpattern.strategy;

/**
 * function desc
 *
 * @author lauz
 * @since 2022/11/5
 */
public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("use sword");
    }
}
