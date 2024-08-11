package com.example.hearthstone.component.actor;

import com.example.hearthstone.component.objective.Objective;

public abstract class Giver implements Actor {
    Objective objective;

    public int getValues() {
        return objective.getValues();
    }

}
