package com.example.designpattern.strategy;

/**
 * function desc
 *
 * @author lauz
 * @since 2022/11/5
 */
public class Game {
    public static void main(String[] args) {
        Character c1 = new King();
        Character c2 = new Queen();
        WeaponBehavior w = new SwordBehavior();
        c1.setWeaponBehavior(w);
        c1.fight();
        c2.setWeaponBehavior(new KnifeBehavior());
        c2.fight();
    }
}
