package com.example.hearthstone.game;

import com.example.hearthstone.basic.card.basic.Coin;
import com.example.hearthstone.player.Player;
import com.example.hearthstone.user.User;

import java.util.List;

public class Game {
    /**
     * 게임이 진행될 동안 필요한 이벤트 pub/sub
     * pub/sub을 구현하기는 쉽지 않을거 같아 우선 외부 카프카를 사용하고
     * 이벤트 기반으로 객체들이 동작하도록만 구현해볼 생각
     *
     * 이벤트 기반은 비동기/결과적 정합성이라 적절하지 않을수도 있다
     * 효과를 발동해야 하는데 안하고 나중에 하는건 말이 안된다
     * 또한 죽음의 메아리같은건 처음 카드를 낸 순서대로 발동해야 하고 이게 꽤 중요하다
     */



    Player p1;
    Player p2;

    Integer turnCount;

    List<Turn> history;


    /**
     * 모든 순간 게임이 끝났는지 여부를 판단해야 한다
     * 카드를 뽑을 때, 턴을 시작할 때, 공격하거나 받을 때, 턴이 끝날 때, 카드를 낼 때 등등
     *
     */
    public void play(User u1, User u2) {
        p1 = new Player();
        p1.setDeck(u1.getDeck());
        p1.setHero(u1.getHero());

        p2 = new Player();
        p2.setDeck(u2.getDeck());
        p2.setHero(u2.getHero());

        startGame(p1, p2);
        while(p1.defeat() || p2.defeat()) {
            // 턴 여러번 하기
            Turn p1Turn = null;
            while(p1Turn.proceedable()) {
                p1Turn = new Turn(p1, p2); // 이렇게 턴변수를 재활용하는 형태면 턴카운트는 변수로 주면 안됨.
                p1Turn.proceed();
            }


            // TODO : 현재 로직은 플레이어1 턴에 게임이 끝났지만 플레이어2의 턴이 진행된다.
            // 턴에서 게임이 끝났다는 값을 받으면 break으로 while 탈출하기?
            // 그러면 while의 조건은 true로(무한루프) 해도 될거 같은데?
            new Turn(p2,p1,turnCount++).proceed();

            turnCount++;
        }

        // 게임 결과를 다른 모듈에게 이벤트로 발송

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


    private void endGame(Player p1, Player p2) {
        if(p1.defeat() && !p2.defeat()) {
            // p2 승리
        }
        if(!p1.defeat() && p2.defeat()){
            // p1 승리
        }
        if(p1.defeat() && p2.defeat()){
            // 무승부
        }
    }

}
