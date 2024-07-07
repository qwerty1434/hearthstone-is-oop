package com.example.hearthstone.basic.card;

/*
 * 탈진
 */
public class Fatigue implements Card{
    Integer fatigueDamage;

    // 핸드에 들어갔을 때 자동적으로 사용되게 한다? 핸드에 들어가는 개념이면 10장있을 때 탈진을 안받아버리네
    public Fatigue(Integer fatigueDamage) {
        this.fatigueDamage = fatigueDamage;
    }

    @Override
    public void whenDrawn() {

    }

    @Override
    public void whenUsed() {

    }

    @Override
    public void whenDiscarded() {

    }

}
