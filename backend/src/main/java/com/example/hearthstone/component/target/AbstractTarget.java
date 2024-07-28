package com.example.hearthstone.component.target;

public abstract class AbstractTarget implements Target{
    private SelectedOrNot selectedOrNot;
    private Possession possession;
    private Type type;
    private Integer index;

    public AbstractTarget(SelectedOrNot selectedOrNot, Possession possession, Type type, Integer index) {
        this.selectedOrNot = selectedOrNot;
        this.possession = possession;
        this.type = type;
        this.index = index;
    }
}
