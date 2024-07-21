package com.example.hearthstone.game;

import com.example.hearthstone.card.Minion;
import org.assertj.core.groups.Tuple;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GameTest {

    @Test
    @DisplayName("(22,11,33) | (11) -> (11)이 (11)을 공격 -> (22,33) | ()")
    void minionAttackTest() {
        // given
        Game game = new Game();
        game.p1.getHand().addCard(new Minion(2,2,1));
        game.p1.getHand().addCard(new Minion(1,1,1));
        game.p1.getHand().addCard(new Minion(3,3,1));
        game.p2.getHand().addCard(new Minion(1,1,1));
        game.p2.getHand().addCard(new Minion(1,1,1));
        game.p2.getHand().addCard(new Minion(1,1,1));

        game.startTurn();
        game.useCard(0,0);
        game.useCard(0,1);
        game.useCard(0,2);
        game.endTurn();

        game.startTurn();
        game.useCard(0,0);

        // when
        game.attack(0,1);

        // then
        assertThat(game.getP1().getHand().getHand()).isEmpty();
        assertThat(game.getP2().getField().getField()).isEmpty();
        assertThat(game.getP1().getField().getField())
                .extracting("attack","health")
                .containsExactly(
                        Tuple.tuple(2,2),
                        Tuple.tuple(3,3)
                );


    }
}