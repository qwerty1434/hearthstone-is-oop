package com.example.hearthstone.component.action;


import com.example.hearthstone.component.actor.Actor;
import com.example.hearthstone.component.target.Target;

public interface TargetableAction {
    void acts(Actor actor, Target target);
}
