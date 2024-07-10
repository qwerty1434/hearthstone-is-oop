package com.example.hearthstone.player;

import com.example.hearthstone.basic.card.Card;
import com.example.hearthstone.basic.card.Fatigue;
import com.example.hearthstone.basic.card.InGameCard;

import java.util.Deque;

public class Deck {
    private Deque<InGameCard> deck;

    // 탈진은 객체에 포함되어야 한다?
    // 덱에서 카드를 뽑을 때마다 탈진을 확인해야 하기 때문에 밀접한 관련이 있음
    // 하지만 탈진이 덱에서 뽑는 것에만 국한된 건 아님
    private Integer fatigueDamage; // 탈진
    private boolean isHighlander;

    // 뽑다
    public InGameCard drawn() {
        // 핸드에 들어갔을 때 자동적으로 사용되게 한다? 핸드에 들어가는 개념이면 10장있을 때 탈진을 안받아버리네
        if(deck.isEmpty()) {
            return new Fatigue(fatigueDamage++);
        }
        // TODO : 뽑을 때 시전 : 효과를 시전하고 다음 카드를 뽑는다, 재귀?
        InGameCard card = deck.pollFirst();
        card.whenDrawn();

        return card;
    }

    // N개의 카드를 제시하다
    public void presentCardsFromDeck(int count) {

    }

    // 발견하다
    public void discovered() {

    }

    // 인양하다
    public void dredged() {

    }


    // 특정 카드를 뽑습, 발견 등등 -> Deck을 for문 돌면서 filtering

    // 개전 효과를 적용하다
    // StartOfGame : 개전
    public void applyStartOfGameEffect() {

    }

    // 카드는 정해져있지만 매 게임마다 인스턴스로 만들어야 버프같은게 유지됨
    public void makeInstance() {}

    public void shuffle() {}


}
