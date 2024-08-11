package com.example.hearthstone.component.concrete;

import com.example.hearthstone.component.actor.Attacker;
import com.example.hearthstone.component.target.Defender;
import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Minion implements Attacker, Defender {
    Integer attackPower;
    Integer health;
    Integer attackCapacity;

    private Minion() {}



    public boolean isDied() {
        return health <= 0;
    }

    public void whenDiesHook() {
        // removeFromField
        // 죽음의 메아리
    }

    public void gainAttackCapacity(int attackCapacity) {
        this.attackCapacity = attackCapacity;
    }

    public void useAttackCapacity() {
        this.attackCapacity--;
    }

    @Override
    public void attack(Defender defender) {
        if(!isAssailable()) throw new RuntimeException("공격할 수 없습니다.");
        defender.gotDamage(attackPower);
        this.gotDamage(defender.recoilDamage());
        this.useAttackCapacity();
    }

    @Override
    public boolean isAssailable() {
        // 빙결일때도 공격 못함
        return attackCapacity > 0;
    }


    @Override
    public void gotDamage(int damage) {
        loseHealth(damage);
        if(isDied()) {
            // removeFromField(여기서 죽음의 메아리도?)

        }
    }

    @Override
    public void loseHealth(int damage) {
        health -= damage;
    }

    @Override
    public int recoilDamage() {
        return attackPower;
    }

    @Override
    public void adjustStat(int attackPower, int health) {
        // 일시적인 것과 영구적인것 구분 필요
        attackPower += attackPower;
        health += health;
    }


}
