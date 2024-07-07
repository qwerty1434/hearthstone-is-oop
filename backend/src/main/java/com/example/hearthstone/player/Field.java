package com.example.hearthstone.player;

import com.example.hearthstone.basic.card.InGameCard;
import lombok.Getter;

import java.util.List;

@Getter
public class Field {
    List<InGameCard> field;

    public void turnStarts() {
        field.forEach(InGameCard::whenTurnStarts);
    };

    public void turnEnds() {
        field.forEach(InGameCard::whenTurnEnds);
    };
}
