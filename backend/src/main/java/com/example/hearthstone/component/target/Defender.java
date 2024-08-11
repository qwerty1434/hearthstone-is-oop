package com.example.hearthstone.component.target;

public interface Defender extends Target{
    void gotDamage(int damage);
    int recoilDamage();

}
