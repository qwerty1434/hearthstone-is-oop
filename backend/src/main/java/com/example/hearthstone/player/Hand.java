package com.example.hearthstone.player;

import com.example.hearthstone.basic.card.Card;
import com.example.hearthstone.basic.card.InGameCard;
import lombok.Getter;

import java.util.List;

@Getter
public class Hand {
    private List<InGameCard> hand;
    private Integer upperLimitOfCards;

    public void addCard(InGameCard card) {
        if(hand.size() == upperLimitOfCards) throw new RuntimeException("카드가 너무 많습니다.");
        hand.add(card);
    }

}
