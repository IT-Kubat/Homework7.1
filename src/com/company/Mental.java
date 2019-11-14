package com.company;

public class Mental extends Player {
    private int manTreat;

    public Mental(int health, String damage, int manTreat) {
        super(health, damage);
        this.manTreat = manTreat;
    }

    public int getManTreat() {
        return manTreat;
    }

    public void setManTreat(int manTreat) {
        this.manTreat = manTreat;
    }

    @Override
    public void Drawable() {
        System.out.println("\uD83E\uDDE0");
    }
}