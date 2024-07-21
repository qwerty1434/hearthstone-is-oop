package com.example.hearthstone.player;

import com.example.hearthstone.card.Card;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Hand {
    private List<Card> hand = new ArrayList<>();

    public Card useCard(int index) {
        return hand.remove(index);
    }

    public void addCard(Card card) {
        hand.add(card);
    }
}
