package com.example.hearthstone.component.actor;

import com.example.hearthstone.component.target.Defender;

public interface Attacker extends Actor{

    void attack(Defender defender);
    boolean isAssailable();

}
