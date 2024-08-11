package com.example.hearthstone.component.action;


import com.example.hearthstone.component.actor.Attacker;
import com.example.hearthstone.component.target.Defender;

public class ConcreteAttack implements Attack{

    @Override
    public void attacks(Attacker attacker, Defender defender) {
        attacker.attack(defender);
    }

}
