package com.example.hearthstone.player;

import com.example.hearthstone.card.Minion;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Field {
    private List<Minion> field = new ArrayList<>();

    public void setCard(Minion minion, int index) {
        index = resizingIndex(index);

        field.add(index,minion);
    }

    public void removeCard(int index) {
        field.remove(index);
    }

    public Minion controlCard(int index) {
        return field.get(index);
    }

    private int resizingIndex(int index) {
        if(index < 0) {
            index = 0;
        }else if (index > field.size()) {
            index = field.size();
        }
        return index;
    }

}
