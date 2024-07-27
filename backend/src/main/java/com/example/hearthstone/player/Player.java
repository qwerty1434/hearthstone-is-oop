package com.example.hearthstone.player;

import com.example.hearthstone.card.Card;
import com.example.hearthstone.card.Minion;

public class Player {
    Hand hand = new Hand();
    Field field = new Field();

    public void useCard(int handIndex, int fieldIndex) {
        Card card = hand.useCard(handIndex);
        if(card instanceof Minion) {
            Minion minion = (Minion) card;
            field.setCard(minion, fieldIndex);
        }
    }

    public Hand getHand() {
        return hand;
    }

    public Field getField() {
        return field;
    }

}
