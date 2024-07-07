package com.example.hearthstone.game;

import com.example.hearthstone.basic.card.Card;
import com.example.hearthstone.basic.card.basic.Coin;
import com.example.hearthstone.player.Player;
import com.example.hearthstone.user.User;

import java.util.ArrayList;
import java.util.List;

public class Game {
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

    private void turn(Player player) {
        // 턴이 시작할 때 실행되어야 할 것들
        player.resetManaWhenTurnStarts();
        player.drawCardFromDeck();
        // == 다양한 행동을 할 수 있다(카드를 사용한다, 공격한다, ...) == //
        player.endTurn();
        // 턴이 끝날 때 실행되어야 할 것들
    }

    // 턴 관련
    /*
        내 턴이 시작될 때
        내 턴이 끝날 때
        상대 턴이 시작될 때
        상태 턴이 끝날 때
        각 플레이어의 턴이 시작/끝날 때
        지난 턴, 이번 턴 ~~를 했으면 -> 모든 액션을 로그처럼 stack에 쌓는다? [턴, 플레이어, 행동], ...
        매 턴

        턴을 List로 만들고 해당 List에 들어있는 카드들의 효과를 발동한다?
        해당 카드의 효과가 끝나거나 해당 하수인이 죽었을 때 리스트에서 제거하는 건 어떻게?

     */


}
