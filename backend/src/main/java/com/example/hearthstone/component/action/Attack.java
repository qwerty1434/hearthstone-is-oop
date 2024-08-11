package com.example.hearthstone.component.action;

import com.example.hearthstone.component.actor.Actor;
import com.example.hearthstone.component.actor.Attacker;
import com.example.hearthstone.component.target.Defender;
import com.example.hearthstone.component.target.Target;

public interface Attack extends TargetableAction{

    @Override
    default void acts(Actor actor, Target target) {
        attacks((Attacker)actor, (Defender)target);
    }
    void attacks(Attacker attacker, Defender defender);

}
