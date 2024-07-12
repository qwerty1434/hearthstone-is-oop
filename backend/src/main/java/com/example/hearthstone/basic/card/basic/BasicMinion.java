package com.example.hearthstone.basic.card.basic;

import com.example.hearthstone.basic.card.Minion;
import com.example.hearthstone.basic.target.AttackTarget;
import com.example.hearthstone.basic.target.range.Range;
import com.example.hearthstone.player.life.Life;

public class BasicMinion implements Minion {
    private Integer attack;
    private Life life;
    @Override
    public void attack(AttackTarget target, Range range) {
        int damage = target.getDamage();
        life.lose(damage);
    }



}
