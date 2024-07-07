package com.example.hearthstone.user;

import com.example.hearthstone.player.Deck;
import com.example.hearthstone.player.Hero;
import lombok.Getter;

@Getter
public class User {
    private Deck deck;
    private Hero hero;
}
