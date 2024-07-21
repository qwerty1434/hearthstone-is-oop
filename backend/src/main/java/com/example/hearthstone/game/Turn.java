package com.example.hearthstone.game;

import com.example.hearthstone.card.Minion;
import com.example.hearthstone.player.Player;

public class Turn {
    private Player me;
    private Player opponent;

    public Turn(Player me, Player opponent) {
        this.me = me;
        this.opponent = opponent;
    }

    /**
     * 나중에 주문이 됐을 때는
     * 주문이 내 필드의 하수인을 대상으로 하는건지, 상대 필드의 하수인을 대상으로 하는건지
     */
    public void useCard(int handIndex, int fieldIndex) {
        Minion card = (Minion)me.getHand().useCard(handIndex);
        me.getField().setCard(card, fieldIndex);

    }

    public void proceedAttack(int attackerIndex, int defenderIndex) {
        Minion attacker = me.getField().controlCard(attackerIndex);
        Minion defender = opponent.getField().controlCard(defenderIndex);
        attacker.attack(defender);
        if(attacker.isDied()) {
            me.getField().removeCard(attackerIndex);
        }
        if(defender.isDied()) {
            opponent.getField().removeCard(defenderIndex);
        }
    }

    public void turnStarts() {}

    public void turnEnds() {}

}
