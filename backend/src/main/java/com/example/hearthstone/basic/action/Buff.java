package com.example.hearthstone.basic.action;

import com.example.hearthstone.basic.card.InGameCard;

public interface Buff {

    // 합연산, 곱연산
    void buff(InGameCard target, int attack, int life);

}
