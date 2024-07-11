package com.example.hearthstone.basic.action;

import com.example.hearthstone.basic.target.AttackTarget;
import com.example.hearthstone.basic.target.range.Range;

public interface Attackable {
    /**
     * 공격은 영웅과 하수인만 할 수 있다
     * 공격받는 대상(Target)도 영웅과 하수인만 가능하다
     * 공격시 양쪽의 체력이 깎인다
     */
    void attack(AttackTarget target, Range range);

    /**
     * 공격할 수 없는 하수인도 있다
     * -> Target과 Range를 None으로 주면 될듯
     * 공격하면 자신의 공격력만큼 상대의 체력을 깎고
     * 상대의 공격력만큼 자신의 체력을 깎는다
     * -> target은 무조건 공격력을 가져야 되네? 0이더라도
     */

    /**
     * 질풍은 2번, 광풍은 4번 공격할 수 있다
     */
}
