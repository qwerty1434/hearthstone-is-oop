package com.example.hearthstone.player.life;

public class HeroLife implements Life {
    private int upperLimitOfLife;
    private int currentLife;

    @Override
    public void gain(int count) {
        currentLife = Math.max(upperLimitOfLife, currentLife + count);
    }

    @Override
    public void lose(int count) {
        currentLife -= count;
    }

    @Override
    public boolean isExhausted() {
        return currentLife <= 0;
    }

    public void isDefeated() {
        if(currentLife < 0) throw new RuntimeException("게임 종료");
    }

}
