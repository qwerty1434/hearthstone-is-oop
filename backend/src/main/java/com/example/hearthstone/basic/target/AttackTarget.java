package com.example.hearthstone.basic.target;

public interface AttackTarget extends Target {

    void attacked(int damage);

    // TODO : 공격력을 확인하다 라는 느낌의 영어
    int getDamage();
}
