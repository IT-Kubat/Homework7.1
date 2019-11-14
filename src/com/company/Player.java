package com.company;

public abstract class Player implements SuperAbilitible {
    private int health;
    private String damage;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public Player(int health, String damage) {
        this.health = health;
        this.damage = damage;
    }
}