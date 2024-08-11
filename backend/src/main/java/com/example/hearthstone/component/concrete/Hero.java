package com.example.hearthstone.component.concrete;

import com.example.hearthstone.component.actor.Attacker;
import com.example.hearthstone.component.target.Defender;

public class Hero implements Attacker, Defender {
    Integer health;
    Integer attackCapacity;

    @Override
    public void attack(Defender defender) {

    }

    @Override
    public boolean isAssailable() {
        // 무기를 차고 있고, 공격 횟수가 남아 있고, 빙결상태가 아니면
        return false;
    }

    @Override
    public void gotDamage(int damage) {
        health -= damage;
    }

    @Override
    public int recoilDamage() {
        return 0;
    }

    @Override
    public void loseHealth(int damage) {

    }

    @Override
    public void adjustStat(int attackPower, int health) {

    }
}
