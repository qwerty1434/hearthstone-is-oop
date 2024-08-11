package com.example.hearthstone.component.concrete.component;

public interface Life {
    void increase(int amount);
    void decrease(int amount);
    void gain(int amount);

    void lose(int amount);

    boolean isExhausted();
}
