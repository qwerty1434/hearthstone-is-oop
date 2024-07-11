package com.example.hearthstone.basic.card.basic;

import com.example.hearthstone.basic.action.Attackable;
import com.example.hearthstone.basic.condition.Status;

public abstract class BasicMinion
        implements Attackable, Status {
    private Integer attack;
    private Integer health;
}
