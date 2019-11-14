package com.company;
public class Boss extends Player {
    private String defenceType;

    public Boss(int health, String damage, String defenceType) {
        super(health, damage);
        this.defenceType = defenceType;
    }

    public String getDefenceType() {
        return defenceType;
    }

    public void setDefenceType(String defenceType) {
        this.defenceType = defenceType;
    }

    @Override
    public void Drawable() {

    }
}
