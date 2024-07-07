package com.example.hearthstone.basic.card;

public interface InGameCard extends Card{

    void whenDrawn();
    void whenUsed();
    void whenDiscarded();
    void whenTurnEnds();
    void whenTurnStarts();

}
