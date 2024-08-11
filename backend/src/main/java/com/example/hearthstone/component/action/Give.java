package com.example.hearthstone.component.action;

import com.example.hearthstone.component.actor.Giver;
import com.example.hearthstone.component.target.Target;

public interface Give {
    void gives(Giver giver, Target target);
}
