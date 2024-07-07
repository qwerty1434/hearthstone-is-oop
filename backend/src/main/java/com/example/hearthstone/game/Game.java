package com.example.hearthstone.game;

import com.example.hearthstone.player.Player;
import com.example.hearthstone.user.User;

public class Game {
    Player p1;
    Player p2;

    public void play(User u1, User u2) {
        setting();
        while(true) {

        }
    }

    private void setting() {
        p1 = new Player();
        p2 = new Player();
        // 개전 startOfGame();
        // 기본마나 세팅
        // 선후공 결정 및 동전 부여
        // 멀리건

    }

    private void turn(Player player) {
        player.setMana();
        player.drawCardFromDeck();

    }

    // lifeCycle
    public void 턴을_시작할_때() {

    }

}
