package com.example.hearthstone.component.objective;

public class AttackBuff implements Objective{
    private int attack;
    @Override
    public int getValues() {
        return attack;
    }
}
