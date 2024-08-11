package com.example.hearthstone.game;

import com.example.hearthstone.component.action.Attack;
import com.example.hearthstone.component.action.TargetableAction;
import com.example.hearthstone.component.actor.Attacker;
import com.example.hearthstone.component.target.Defender;
import com.example.hearthstone.component.target.Target;
import com.example.hearthstone.component.actor.Actor;
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


    public void targetableAction(Actor actor, Target target, TargetableAction action) {
        action.acts(actor,target);

//        Minion attacker = actor.getActor();
//        attacker.attack(target);
//
//        if(attacker.isDied()) {
//            me.getField().removeCard(actor.getIndex());
//        }
//
//        if(target.getTarget().isDied()) {
//            opponent.getField().removeCard(target.getIndex());
//        }
    }

    public void turnStarts() {}

    public void turnEnds() {}

}
