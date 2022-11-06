package com.example.designpattern.strategy;

/**
 * function desc
 *
 * @author lauz
 * @since 2022/11/5
 */
public abstract class Character {
    WeaponBehavior weaponBehavior;

    public abstract void fight();

    void setWeaponBehavior(WeaponBehavior w) {
        this.weaponBehavior = w;
    }
}
