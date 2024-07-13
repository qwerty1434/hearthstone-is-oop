package com.example.hearthstone.basic.card;

public interface InGameCard extends Card{

    // 하수인이면 소환
    // 주문이면 사용
    // 무기면 장착
    void use();
    void whenDrawn();
    void whenUsed();
    void whenDiscarded();
    void whenTurnEnds();
    void whenTurnStarts();

}
