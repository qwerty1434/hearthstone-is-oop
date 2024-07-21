package com.example.hearthstone.card;


import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Minion implements Card {
    Integer attack;
    Integer health;
    Integer attackCapacity;

    private Minion() {}

    public void attack(Minion defender) {
        if(attackCapacity <= 0) throw new RuntimeException("공격할 수 없습니다");
        defender.loseHealth(this.attack);
        loseHealth(defender.attack);
        attackCapacity--;
    }

    public boolean isDied() {
        return health <= 0;
    }

    public void gainAttackCapacity(int attackCapacity) {
        this.attackCapacity = attackCapacity;
    }

    private void loseHealth(int damage) {
        health -= damage;
    }


}
