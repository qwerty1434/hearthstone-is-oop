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

    public void useCard(int handIndex, int fieldIndex) {
        me.useCard(handIndex, fieldIndex);
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
