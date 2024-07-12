package com.example.hearthstone.player;


import com.example.hearthstone.basic.action.Attackable;
import com.example.hearthstone.basic.card.Card;
import com.example.hearthstone.basic.card.Fatigue;
import com.example.hearthstone.basic.target.AttackTarget;
import com.example.hearthstone.basic.target.range.Range;
import com.example.hearthstone.player.life.Life;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Player implements AttackTarget, Attackable {
    /**
     * 카드를 내고 턴을 진행하는 플레이어로서의 역할이 있고
     * 공격을 하고 피해를 받는 게임 내 하나의 객체로서의 역할이 있다
     */
    private Hero hero;
    private Life life;
    private Shield shield;
    private Deck deck;
    private Field field;
    private Hand hand;
    private ManaCristal mana;
    private Fatigue fatigue;
    private Integer attack;
    private WeaponSocket weaponSocket;

    public void mulligan(int count) {
        // TODO : 퀘스트는 무조건 멀리건에 잡히고 시작
    }

    public boolean defeat() {
        return life.isExhausted();
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


    /**
     * 플레이어는 게임 중 다음과 같은 행동을 할 수 있다
     *  - 카드를 낸다(주문을 시전한다/하수인을 낸다)
     *  - 하수인으로 공격을 한다, 하수인의 효과를 사용한다
     *  - 무기로 직접 공격한다
     *  - 장소같이 특정 카드의 효과를 사용한다
     */
    public void spendCard() {

    }

    public void controlMinion() {

    }

    public void attack() {

    }

    public void activateEffect() {

    }

    public void endTurn() {};

    @Override
    public void attack(AttackTarget target, Range range) {

        // 무기를 장착하고 있으면 공격 후 무기의 내구도를 잃는다

    }

    @Override
    public void attacked(int damage) {
        if(shield.getAmount() < damage) {
            int lifeDamage = damage - shield.getAmount();
            shield.loseAll();
            life.lose(lifeDamage);
        }else{
            shield.lose(damage);
        }
    }

    @Override
    public int getDamage() {
        return attack;
    }
}
