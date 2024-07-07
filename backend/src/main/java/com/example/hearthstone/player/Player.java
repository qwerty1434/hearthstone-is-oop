package com.example.hearthstone.player;


import com.example.hearthstone.basic.card.Card;
import com.example.hearthstone.basic.card.Fatigue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Player {
    private Hero hero;
    private Life life;
    private Shield shield;
    private Deck deck;
    private Field field;
    private Hand hand;
    private ManaCristal mana;
    private Fatigue fatigue;

    public void mulligan(int count) {
        // TODO : 퀘스트는 무조건 멀리건에 잡히고 시작
    }

    public void drawCardFromDeck() {
        // 뽑을 때 시전 : 효과를 시전하고 다음 카드를 뽑는다, 재귀?
        Card card = deck.drawn();

        hand.getHand().add(card);
    }

    public void initMana() {

    }

    public void resetManaWhenTurnStarts() {
        mana.resetManaCristal();
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public void isAttacked(int damage) {
        if(shield.getAmount() < damage) {
            int lifeDamage = damage - shield.getAmount();
            shield.loseAll();
            life.lose(lifeDamage);
        }else{
            shield.lose(damage);
        }
    }

    public void endTurn() {};



}
