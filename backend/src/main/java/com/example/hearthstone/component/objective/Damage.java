package com.example.hearthstone.component.objective;

public class Damage implements Objective{
    private int damage;

    @Override
    public int getValues() {
        return damage;
    }
}
