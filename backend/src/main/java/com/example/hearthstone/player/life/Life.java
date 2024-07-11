package com.example.hearthstone.player.life;

public interface Life {
    void gain(int count);

    void lose(int count);

    boolean isExhausted();

}
