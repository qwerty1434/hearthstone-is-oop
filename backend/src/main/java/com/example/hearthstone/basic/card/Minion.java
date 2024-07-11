package com.example.hearthstone.basic.card;

import com.example.hearthstone.basic.action.Attackable;
import com.example.hearthstone.basic.target.Target;

public interface Minion extends InGameCard, Attackable, Target {
    /** target을 extends하는건 좋아보이는데
     * Attack은 extends보다 합성이 좋아보이기도 하고
     */
}
