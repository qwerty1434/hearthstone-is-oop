package com.example.hearthstone.player;

import com.example.hearthstone.basic.card.Card;
import lombok.Getter;

import java.util.List;

@Getter
public class Hand {
    private List<Card> hand;
    private Integer upperLimitOfCards;

}
