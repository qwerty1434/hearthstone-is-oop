package com.example.hearthstone.basic.action;

import com.example.hearthstone.basic.target.Target;
import com.example.hearthstone.basic.target.range.Range;

public interface Action {
    void act(Target target, Range range);

}
