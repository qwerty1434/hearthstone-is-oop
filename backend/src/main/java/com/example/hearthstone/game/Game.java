package com.example.hearthstone.game;

import com.example.hearthstone.basic.card.Card;
import com.example.hearthstone.basic.card.basic.Coin;
import com.example.hearthstone.player.Player;
import com.example.hearthstone.user.User;

import java.util.ArrayList;
import java.util.List;

public class Game {
    /**
     * 게임이 진행될 동안 필요한 이벤트 pub/sub
     * pub/sub을 구현하기는 쉽지 않을거 같아 우선 외부 카프카를 사용하고
     * 이벤트 기반으로 객체들이 동작하도록만 구현해볼 생각
     */



    Player p1;
    Player p2;



    public void play(User u1, User u2) {
        p1 = new Player();
        p1.setDeck(u1.getDeck());
        p1.setHero(u1.getHero());

        p2 = new Player();
        p2.setDeck(u2.getDeck());
        p2.setHero(u2.getHero());

        startGame(p1, p2);
        while(true) {
            new Turn().proceed();
            new Turn().proceed();
        }
    }

    private void startGame(Player p1, Player p2) {
        // 개전
        p1.getDeck().applyStartOfGameEffect();
        p2.getDeck().applyStartOfGameEffect();

        // 플레이어 세팅(기본마나 세팅, 선후공 결정, ...)

        // 멀리건

        // 동전 부여
        p2.getHand().addCard(new Coin());


    }

}
