package com.example.hearthstone.component.targetable;

import com.example.hearthstone.component.action.Action;
import com.example.hearthstone.component.target.Target;

/**
 * 지정 타겟에게 동작을 실행한다
 */
public interface Targetable<T extends Action> {

    void doActionOnTarget(Target target, T action);
}
