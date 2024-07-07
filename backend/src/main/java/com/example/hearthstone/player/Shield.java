package com.example.hearthstone.player;

import lombok.Getter;

@Getter
public class Shield {
    private int amount;

    public void gain(int count) {
        amount += count;
    }

    public void lose(int count) {
        amount -= count;
    }

    public void loseAll() {
        this.amount = 0;
    }
}
