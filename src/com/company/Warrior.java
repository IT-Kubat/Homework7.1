package com.company;

public class Warrior extends Player {
    private int hitType;

    public Warrior(int health, String damage, int hitType) {
        super(health, damage);
        this.hitType = hitType;
    }

    public int getHitType() {
        return hitType;
    }

    public void setHitType(int hitType) {
        this.hitType = hitType;
    }


    @Override
    public void Drawable() {
        System.out.println("⚔");
    }
}