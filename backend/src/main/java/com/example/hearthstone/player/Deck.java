package com.example.hearthstone.player;

import com.example.hearthstone.basic.card.Card;
import com.example.hearthstone.basic.card.Fatigue;

import java.util.Deque;

public class Deck {
    private Deque<Card> deck;
    private Integer fatigueDamage; // 탈진
    private boolean isHighlander;

    // 뽑다
    public Card drawn() {
        // 핸드에 들어갔을 때 자동적으로 사용되게 한다? 핸드에 들어가는 개념이면 10장있을 때 탈진을 안받아버리네
        if(deck.isEmpty()) {
            return new Fatigue(fatigueDamage++);
        }
        // TODO : 뽑을 때 시전 : 효과를 시전하고 다음 카드를 뽑는다, 재귀?
        Card card = deck.pollFirst();
        card.whenDrawn();

        return card;
    }

    // 발견하다
    public void discover() {

    }

    // 인양하다
    public void dredged() {

    }


    // 특정 카드를 뽑습, 발견 등등 -> Deck을 for문 돌면서 filtering




}
