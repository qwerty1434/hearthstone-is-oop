package com.example.hearthstone.basic.card;

public interface InGameCard extends Card{

    void whenDrawn();
    void whenUsed();
    void whenDiscarded();
    void whenMyTurnStarts();
    void whenMyTurnEnds();
    void whenOpponentTurnStarts();
    void whenOpponentTurnEnds();

}
