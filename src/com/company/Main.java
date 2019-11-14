package com.company;

public class Main {

    public static void main(String[] args) {
        Mental mental = new Mental(200, "40", 20);
        mental.Drawable();
        Warrior warrior = new Warrior(200, "40", 20);
        warrior.Drawable();
        Magic magic = new Magic(200, "40", "Magic");
        magic.Drawable();
    }
}
