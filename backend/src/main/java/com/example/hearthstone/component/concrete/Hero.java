package com.example.hearthstone.component.concrete;

import com.example.hearthstone.component.actor.Attacker;
import com.example.hearthstone.component.concrete.component.HeroLife;
import com.example.hearthstone.component.target.Defender;

public class Hero implements Attacker, Defender {
    HeroLife life;
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
    public int recoilDamage() {
        return 0;
    }

    @Override
    public void gotDamage(int damage) {
        life.lose(damage);
    }

    @Override
    public void restoreHealth(int heal) {
        life.gain(heal);
    }

    @Override
    public void adjustStat(int attackPower, int health) {

    }
}
