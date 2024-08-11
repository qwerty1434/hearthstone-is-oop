package com.example.hearthstone.component.target;

/**
 * 타겟으로 지정되는 대상의 속성
 * cf) {@link com.example.hearthstone.component.actor} : 타겟에게 어떤 동작을 실행한다
 */
public interface Target {
    void gotDamage(int damage);
    void restoreHealth(int heal);
    void adjustStat(int attackPower, int health);

}
