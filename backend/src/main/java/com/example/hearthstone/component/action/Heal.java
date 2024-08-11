package com.example.hearthstone.component.action;

import com.example.hearthstone.component.actor.Giver;
import com.example.hearthstone.component.target.Target;

public class Heal implements Give {
    @Override
    public void gives(Giver giver, Target target) {
        target.restoreHealth(giver.getValues());
    }
}
