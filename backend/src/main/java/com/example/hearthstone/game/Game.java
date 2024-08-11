package com.example.hearthstone.game;

import com.example.hearthstone.component.action.TargetableAction;
import com.example.hearthstone.component.target.Target;
import com.example.hearthstone.component.actor.Actor;
import com.example.hearthstone.player.Player;
import lombok.Getter;

import java.util.Stack;
import java.util.UUID;

@Getter
public class Game {
    Player p1 = new Player();
    Player p2 = new Player();

    String gameId = UUID.randomUUID().toString();
    int turnCount = 0;
    boolean isPlayer1Turn = true;
    Stack<Turn> turnHistory = new Stack<>();
    Turn nowTurn = null;

    public void initGame() {
    }

    public void startTurn() {
        nowTurn = new Turn(isPlayer1Turn ? p1 : p2,
                            isPlayer1Turn ? p2 : p1);
        nowTurn.turnStarts();
    }


    public void useCard(int handIndex, int fieldIndex) {
        nowTurn.useCard(handIndex, fieldIndex);
    }

    public void targetableAction(Actor actor, Target target, TargetableAction action) {
        nowTurn.targetableAction(actor, target, action);
    }

    public void endTurn() {
        turnCount++;
        isPlayer1Turn = !isPlayer1Turn;
        nowTurn.turnEnds();
        turnHistory.add(nowTurn);

        nowTurn = null;
    }


}
