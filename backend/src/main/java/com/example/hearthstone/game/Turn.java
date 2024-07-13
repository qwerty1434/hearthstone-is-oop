package com.example.hearthstone.game;

import com.example.hearthstone.player.Player;

public class Turn {
    private Player me;
    private Player opponent;

    /**
     * 턴은 인스턴스 변수로 뭘 가져야 할까?
     * turnCount를 가지는게 맞나?
     * 매 턴마다 Turn객체를 생성해야 할까 아니면 Turn객체를 재활용해야 할까?
     */
    private Integer additionalTurnCondition; // 턴 진행 여부
    
    private Integer turnCount;

    public Turn(Player me, Player opponent, Integer turnCount) {
        this.me = me;
        this.opponent = opponent;
        this.turnCount = turnCount;
    }
    public Turn(Player me, Player opponent) {
        this.me = me;
        this.opponent = opponent;
    }

    public void proceed() {
        opponent.isIncapacitated();
        starts();

        // player play game //

        ends();

        // return createdAdditionalTurn
    }

    public boolean proceedable() {
        return additionalTurnCondition >= 1;
    }

    private void starts() {
        me.getField().activateTurnStartsEffects();
        opponent.getField().activateTurnStartsEffects();

        me.resetManaWhenTurnStarts();
        me.drawCardFromDeck();
    }

    private void ends() {
        me.getField().activateTurnEndsEffects();
        opponent.getField().activateTurnEndsEffects();

        additionalTurnCondition--;
        me.endTurn();
    }
    /*
        내 턴이 진행될 때 상대는 아무런 행동을 못해야 함

     */

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

        그냥 모든 필드카드의 효과를 발생시켜보면 될듯

        하수인에게 매턴 +2/+2효과를 부여하는 주문 -> 하수인과 생명주기가 같음 -> 하수인을 오버라이드?
     */


}
