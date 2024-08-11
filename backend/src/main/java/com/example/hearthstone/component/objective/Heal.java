package com.example.hearthstone.component.objective;

public class Heal implements Objective {
    private int heal;
    @Override
    public int getValues() {
        return heal;
    }
}
