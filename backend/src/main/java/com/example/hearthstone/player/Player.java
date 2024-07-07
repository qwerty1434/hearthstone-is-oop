package com.example.hearthstone.player;


import com.example.hearthstone.basic.card.Card;


public class Player {
    private Hero hero;
    private Life life;
    private Shield shield;
    private Deck deck;
    private Field field;
    private Hand hand;
    private ManaCristal mana;

    public void mulligan() {

    }

    public void drawCardFromDeck() {
        // 뽑을 때 시전 : 효과를 시전하고 다음 카드를 뽑는다, 재귀?
        Card card = deck.drawn();

        hand.getHand().add(card);
    }

    public void initMana() {

    }

    public void setMana() {
        mana.setManaCristal();
    }


}
