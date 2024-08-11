package com.example.hearthstone.component.concrete.component;

public class MinionLife implements Life {
    private int upperLimitOfLife;
    private int currentLife;

    @Override
    public void increase(int amount) {
        upperLimitOfLife += amount;
        currentLife += amount;
    }

    @Override
    public void decrease(int amount) {
        upperLimitOfLife -= amount;
        currentLife -= amount;
    }

    @Override
    public void gain(int amount) {
        currentLife = Math.min(upperLimitOfLife, currentLife + amount);
    }

    @Override
    public void lose(int amount) {
        currentLife -= amount;
    }

    @Override
    public boolean isExhausted() {
        return currentLife <= 0;
    }

}
