package com.example.hearthstone.player;

public class Life {
    private int upperLimitOfLife;
    private int currentLife;
    public void gain(int count) {
        currentLife = Math.max(upperLimitOfLife, currentLife + count);
    }

    public void lose(int count) {
        currentLife -= count;
    }

    public void isDefeated() {
        if(currentLife < 0) throw new RuntimeException("게임 종료");
    }
}
